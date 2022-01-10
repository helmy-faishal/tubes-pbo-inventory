package Model;

public class MainMenu implements TambahBarang,EditBarang,HapusBarang{
    
    public Barang createDataBarang(String nama,String deskripsi,String jumlah,String kategori){
        Barang barang = new Barang(nama, deskripsi, jumlah, kategori);
        switch (kategori) {
            case "Makanan":
                Makanan makanan = new Makanan(barang);
                return makanan;
            case "Minuman":
                Minuman minuman = new Minuman(barang);
                return minuman;
            case "Pakaian":
                Pakaian pakaian = new Pakaian(barang);
                return pakaian;
            case "Furnitur":
                Furnitur furnitur = new Furnitur(barang);
                return furnitur;
            case "Elektronik":
                Elektronik elektronik = new Elektronik(barang);
                return elektronik;
            default:
                 break;
        }
        return barang;
    }
    
    public String getQuerySemuaBarang(){
        String query = "SELECT * FROM `barang";
        return query;
    }
    
    public String getQueryCariBarang(String search){
        String query = "SELECT * FROM `barang` WHERE ";
        query += String.format("idBarang = '%s' ", search);
        query += " OR ";
        query += String.format("namaBarang = '%s' ", search);
        
        return query;
    }
    
    @Override
    public String getQueryInsert(Barang barang) {
        String query = "INSERT INTO barang VALUES(";
        query += String.format("'%s'", barang.getIdBarang());
        query += String.format(",'%s'",barang.getNamaBarang());
        query += String.format(",'%s'",barang.getDeskripsiBarang());
        query += String.format(",'%s'",barang.getJumlahBarang());
        query += String.format(",'%s')",barang.getKategoriBarang());
        
        return query;
    }
    
    @Override
    public String getQueryDelete(String id) {
        String query = "DELETE FROM `barang` WHERE idBarang=";
        query += String.format("'%s'", id);
        return query;
    }

    @Override
    public String getQueryUpdate(String id, String nama, String deskripsi, String jumlah, String kategori) {
        String query = "UPDATE barang SET ";
        query += String.format("namaBarang='%s',", nama);
        query += String.format("deskripsiBarang='%s',", deskripsi);
        query += String.format("jumlahBarang='%s',", jumlah);
        query += String.format("kategoriBarang='%s' ", kategori);
        query += String.format("WHERE idBarang='%s'", id);
        
        return query;
    }

    
    
}
