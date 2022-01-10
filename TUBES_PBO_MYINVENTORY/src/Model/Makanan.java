package Model;

import java.util.Random;

public class Makanan extends Barang {
    
    public Makanan(){}
    public Makanan(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        super(namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang);
        this.setIdBarang();
    }
    public Makanan(Barang barang){
        super(barang);
        this.setIdBarang();
    }
    public String generateIdBarang(){
        Random random = new Random();
        int id = random.nextInt(99999);
        return String.format("MKN%05d", id);
    }
    @Override
    public void setIdBarang(){
        String idBarang = super.getIdBarang();
        if (idBarang.equals("") ||!(idBarang.startsWith("MKN"))){
            idBarang = this.generateIdBarang();
            super.setIdBarang(idBarang);
        }
    }
}
