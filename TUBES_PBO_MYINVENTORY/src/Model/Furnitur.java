package Model;

import java.util.Random;


public class Furnitur extends Barang {
    
    public Furnitur(){}
    public Furnitur(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        super(namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang);
        this.setIdBarang();
    }
    public Furnitur(Barang barang){
        super(barang);
        this.setIdBarang();
    }
    public String generateIdBarang(){
        Random random = new Random();
        int id = random.nextInt(99999);
        return String.format("FTR%05d", id);
    }
    @Override
    public void setIdBarang(){
        String idBarang = super.getIdBarang();
        if (idBarang.equals("") ||!(idBarang.startsWith("FTR"))){
            idBarang = this.generateIdBarang();
            super.setIdBarang(idBarang);
        }
    }
}
