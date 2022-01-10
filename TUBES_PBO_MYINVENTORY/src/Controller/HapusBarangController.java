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

public class HapusBarangController{
    private MainMenu menu = new MainMenu();
    private Database db;
    private MainMenuView menuView;
    private HapusBarangView hapusView;
    private String tempId = "";

    public HapusBarangController(MainMenuView menuView, HapusBarangView hapusView,Database db) {
        this.menuView = menuView;
        this.hapusView = hapusView;
        this.db = db;
        this.hapusView.addKembaliListener(new KembaliListener());
        this.hapusView.addHapusListener(new HapusListener());
        this.hapusView.addCariListener(new CariListener());
    }    
    class KembaliListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            hapusView.setVisible(false);
            menuView.setVisible(true);
            tempId = "";
            hapusView.clearData();
        }
    
    }
    class CariListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cari = hapusView.getCariBarang();
            String query = menu.getQueryCariBarang(cari);
            ResultSet res = db.getDatabaseItem(query);
            try {
                if (res.next()){
                    tempId = res.getString("idBarang");
                    hapusView.setNama(res.getString("namaBarang"));
                    hapusView.setDeskripsi(res.getString("deskripsiBarang"));
                    hapusView.setJumlah(res.getString("jumlahBarang"));
                    hapusView.setKategori(res.getString("kategoriBarang"));
                } else {
                    hapusView.showErrorNotFound();
                    tempId = "";
                }
            } catch (SQLException ex) {
                tempId = "";
                Logger.getLogger(HapusBarangController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    }
    class HapusListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!tempId.equals("")){
                String query = menu.getQueryDelete(tempId);
                db.delete(query);
                hapusView.showSuccess();
                hapusView.clearData();
                tempId = "";
            } else {
                hapusView.showWarning();
            }
        }
    
    }
}
