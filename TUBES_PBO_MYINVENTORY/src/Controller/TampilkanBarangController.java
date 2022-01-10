package Controller;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TampilkanBarangController {
    private TampilkanBarangView tampilView;
    
    public TampilkanBarangController(String nama, String deskripsi, String jumlah, String kategori){
        this.tampilView = new TampilkanBarangView();
        tampilView.setFieldNama(nama);
        tampilView.setFieldDeskripsi(deskripsi);
        tampilView.setFieldJumlah(jumlah);
        tampilView.setFieldKategori(kategori);
        tampilView.addKembaliListener(new KembaliListener());
    }
    public void show(){
        this.tampilView.setVisible(true);
    }
    class KembaliListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            tampilView.dispose();
        }
    }
}
