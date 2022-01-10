package Model;

import java.util.Random;

public class Minuman extends Barang{
    
    public Minuman(){}
    public Minuman(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        super(namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang);
        this.setIdBarang();
    }
    public Minuman(Barang barang){
        super(barang);
        this.setIdBarang();
    }
    public String generateIdBarang(){
        Random random = new Random();
        int id = random.nextInt(99999);
        return String.format("MNM%05d", id);
    }
    @Override
    public void setIdBarang(){
        String idBarang = super.getIdBarang();
        if (idBarang.equals("") ||!(idBarang.startsWith("MNM"))){
            idBarang = this.generateIdBarang();
            super.setIdBarang(idBarang);
        }
    }
}
