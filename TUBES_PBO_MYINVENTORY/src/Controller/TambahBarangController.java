package Controller;
import Database.Database;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TambahBarangController{
    private MainMenu menu = new MainMenu();
    private Database db;
    private MainMenuView menuView;
    private TambahBarangView tambahView;

    public TambahBarangController(MainMenuView menu, TambahBarangView tambah,Database db) {
        this.menuView = menu;
        this.tambahView = tambah;
        this.db = db;
        this.tambahView.addKembaliListener(new KembaliListener());
        this.tambahView.addTambahListener(new TambahListener());
    }
    
    
    class KembaliListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tambahView.setVisible(false);
            menuView.setVisible(true);
            tambahView.clearData();
        }
    
    }
    class TambahListener implements ActionListener{
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
            String nama = tambahView.getNama();
            String deskripsi = tambahView.getDeskripsi();
            String jumlah = tambahView.getJumlah();
            String kategori = tambahView.getKategori();
            if (this.isValid(nama, deskripsi, jumlah, kategori)){
                String query = "";
                Barang barang = menu.createDataBarang(nama, deskripsi, jumlah, kategori);
                query = menu.getQueryInsert(barang);
                
                db.insert(query);
                tambahView.showSuccess();
                tambahView.clearData();
            } else {
                tambahView.showError();
                tambahView.clearData();
            }
        }
    
    }
 
}
