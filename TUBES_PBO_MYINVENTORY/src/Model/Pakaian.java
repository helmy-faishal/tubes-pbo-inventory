package Model;

import java.util.Random;


public class Pakaian extends Barang{
    
    public Pakaian(){}
    public Pakaian(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        super(namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang);
        this.setIdBarang();
    }
    public Pakaian(Barang barang){
        super(barang);
        this.setIdBarang();
    }
    public String generateIdBarang(){
        Random random = new Random();
        int id = random.nextInt(99999);
        return String.format("PKN%05d", id);
    }
    @Override
    public void setIdBarang(){
        String idBarang = super.getIdBarang();
        if (idBarang.equals("") ||!(idBarang.startsWith("PKN"))){
            idBarang = this.generateIdBarang();
            super.setIdBarang(idBarang);
        }
    }
}
