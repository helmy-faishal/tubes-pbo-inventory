package Controller;
import Database.Database;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class MainMenuController {
    private MainMenu menu = new MainMenu();
    private Database db;
    private MainMenuView menuView;
    private TambahBarangView tambahView;
    private HapusBarangView hapusView;
    private EditBarangView editView;
    private TambahBarangController tambahController;
    private HapusBarangController hapusContoller;
    private EditBarangController editController;
    
    
    public MainMenuController(){}
    public MainMenuController(MainMenuView menuView, TambahBarangView tambahView, HapusBarangView hapusView, EditBarangView editView) {
        this.menuView = menuView;
        this.tambahView = tambahView;
        this.hapusView = hapusView;
        this.editView = editView;
        db = new Database();
        
        this.tambahController = new TambahBarangController(menuView,tambahView,db);
        this.hapusContoller = new HapusBarangController(menuView,hapusView,db);
        this.editController = new EditBarangController(menuView,editView,db);
        
        this.menuView.addTambahListener(new TambahListener());
        this.menuView.addHapusListener(new HapusListener());
        this.menuView.addEditListener(new EditListener());
        this.menuView.addCariListener(new CariListener());
        this.menuView.addRefreshListener(new RefreshListener());
        
    }
    public void show(){
        this.showAllItem();
        this.menuView.setVisible(true);
    }
    class RefreshListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            showAllItem();
        }

    }
    class TambahListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            showAllItem();
            menuView.setVisible(false);
            tambahView.setVisible(true);            
        }

    }
    class HapusListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            showAllItem();
            menuView.setVisible(false);
            hapusView.setVisible(true);
            
        }
    }
    class EditListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            showAllItem();
            menuView.setVisible(false);
            editView.setVisible(true);
            
        }
    }
    class CariListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String cari = menuView.getCariBarang();
            String query = menu.getQueryCariBarang(cari);
            ResultSet res = db.getDatabaseItem(query);
            try {
                if (res.next()){
                    String nama = res.getString("namaBarang");
                    String deskripsi = res.getString("deskripsiBarang");
                    String jumlah = res.getString("jumlahBarang");
                    String kategori = res.getString("kategoriBarang");
                    
                    TampilkanBarangController tampil = new TampilkanBarangController(nama,deskripsi,jumlah,kategori);
                    tampil.show();
                } else {
                    menuView.showErrorNotFound();
                }
                menuView.setCariBarang("");
            } catch (SQLException ex) {
                System.out.println(ex);
            }
        }
    
    }
    private void showAllItem(){
        ResultSet res = db.getAllDatabaseItem();
        DefaultTableModel model = new DefaultTableModel();
        model.setRowCount(0);
        String[] column = {"Id","Nama","Deskripsi","Jumlah","Kategori"};
        model.setColumnIdentifiers(column);
        try {
            while (res.next()){
                String[] data = new String[5];
                
                data[0] = res.getString("idBarang");
                data[1] = res.getString("namaBarang");
                data[2] = res.getString("deskripsiBarang");
                data[3] = res.getString("jumlahBarang");
                data[4] = res.getString("kategoriBarang");
                
                model.addRow(data);
                menuView.setTableModel(model);
            }
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
