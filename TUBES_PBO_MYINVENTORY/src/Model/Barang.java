package Model;

public class Barang {
    private String namaBarang,deskripsiBarang,jumlahBarang,kategoriBarang,idBarang;
    
    public Barang(){}
    public Barang(String namaBarang, String deskripsiBarang, String jumlahBarang, String kategoriBarang){
        this.namaBarang = namaBarang;
        this.deskripsiBarang = deskripsiBarang;
        this.jumlahBarang = jumlahBarang;
        this.kategoriBarang = kategoriBarang;
        this.idBarang = "";
    }
    public Barang(Barang barang){
        this.namaBarang = barang.getNamaBarang();
        this.deskripsiBarang = barang.getDeskripsiBarang();
        this.jumlahBarang = barang.getJumlahBarang();
        this.kategoriBarang = barang.getKategoriBarang();
        this.idBarang = barang.getIdBarang();
    }
    
    public void setNamaBarang(String nama){
        this.namaBarang = nama;
    }
    public String getNamaBarang(){
        return this.namaBarang;
    }
    public void setDeskripsiBarang(String deskripsi){
        this.deskripsiBarang = deskripsi;
    }
    public String getDeskripsiBarang(){
        return this.deskripsiBarang;
    }
    public void setJumlahBarang(String jumlah){
        this.jumlahBarang = jumlah;
    }
    public String getJumlahBarang(){
        return this.jumlahBarang;
    }
    public void setKategoriBarang(String kategori){
        this.kategoriBarang = kategori;
    }
    public String getKategoriBarang(){
        return this.kategoriBarang;
    }
    public void setIdBarang(String id){
        this.idBarang = id;
    }
    public void setIdBarang(){
        this.idBarang = "";
    }
    public String getIdBarang(){
        return this.idBarang;
    }
}
