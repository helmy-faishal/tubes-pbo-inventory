package Controller;

import Database.Database;
import View.*;
import Model.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EditBarangController{
    private MainMenu menu = new MainMenu();
    private Database db;
    private MainMenuView menuView;
    private EditBarangView editView;
    private String tempId = "";
    private String tempKategori = "";

    public EditBarangController(MainMenuView menuView, EditBarangView editView,Database db) {
        this.menuView = menuView;
        this.editView = editView;
        this.db = db;
        
        this.editView.addKembaliListener(new KembaliListener());
        this.editView.addCariListener(new CariListener());
        this.editView.addEditListener(new EditListener());
    }
    private void resetTempValue(){
        this.tempId = "";
        this.tempKategori = "";
    }
    class KembaliListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            editView.setVisible(false);
            menuView.setVisible(true);
            editView.clearData();
            resetTempValue();
        }
    
    }
    class CariListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cari = editView.getCariBarang();
            String query = menu.getQueryCariBarang(cari);
            ResultSet res = db.getDatabaseItem(query);
            try {
                if (res.next()){
                    tempId = res.getString("idBarang");
                    tempKategori = res.getString("kategoriBarang");
                    
                    editView.setNama(res.getString("namaBarang"));
                    editView.setDeskripsi(res.getString("deskripsiBarang"));
                    editView.setJumlah(res.getString("jumlahBarang"));
                    editView.setKategori(tempKategori);
                } else {
                    editView.showErrorNotFound();
                    resetTempValue();
                }
            } catch (SQLException ex) {
                resetTempValue();
                Logger.getLogger(HapusBarangController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    class EditListener implements ActionListener{
        private boolean isValid(String nama,String deskripsi,String jumlah,String kategori){
            if (nama.trim().equals("")){
                return false;
            }
            if (deskripsi.trim().equals("")){
                return false;
            }
            if (jumlah.trim().equals("")){
                return false;
            }
            if (kategori.trim().equals("")){
                return false;
            }
            return true;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String nama = editView.getNama();
            String deskripsi = editView.getDeskripsi();
            String jumlah = editView.getJumlah();
            String kategori = editView.getKategori();
            if (!tempId.equals("")){
                if (this.isValid(nama, deskripsi, jumlah, kategori)){
                    if (kategori.equals(tempKategori)){
                        String query = menu.getQueryUpdate(tempId, nama, deskripsi, jumlah, kategori);
                        db.update(query);
                    } else {
                        String query = "";
                        Barang barang = menu.createDataBarang(nama, deskripsi, jumlah, kategori);
                        query = menu.getQueryInsert(barang);
                        db.insert(query);
                    
                        query = menu.getQueryDelete(tempId);
                        db.delete(query);
                    }
                    editView.showSuccess();
                    editView.clearData();
                    resetTempValue();
                } else {
                    editView.showError();
                }
            } else {
                editView.showWarning();
            }
            
        }
    
    }
}
