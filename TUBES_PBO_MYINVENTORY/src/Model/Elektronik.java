package Model;

import java.util.Random;

public class Elektronik extends Barang{
    
    public Elektronik(){}
    public Elektronik(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        super(namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang);
        this.setIdBarang();
    }
    public Elektronik(Barang barang){
        super(barang);
        this.setIdBarang();
    }
    public String generateIdBarang(){
        Random random = new Random();
        int id = random.nextInt(99999);
        return String.format("ELK%05d", id);
    }
    @Override
    public void setIdBarang(){
        String idBarang = super.getIdBarang();
        if (idBarang.equals("") ||!(idBarang.startsWith("ELK"))){
            idBarang = this.generateIdBarang();
            super.setIdBarang(idBarang);
        }
    }
}
