# Tugas Besar Pemrograman Berorientasi Objek

Judul: My Inventory (Manajemen Barang) <br>
Kelompok 7 <br>
Anggota:
* MUHAMMAD HELMY FAISHAL  (1301190400)
* IRKHAM MUHAMMAD FAKHRI  (1301190291)
* AHMAD ZAKKY NAJMY    	  (1301194096)
<br>

# Use Case dan Class Diagram

## Use Case Diagram
![Use Case](https://github.com/helmy-faishal/tubes-pbo-inventory/blob/main/UML/Use%20Case.png?raw=true) <br>

## Class Diagram Model
![Model](https://github.com/helmy-faishal/tubes-pbo-inventory/blob/main/UML/Model.png?raw=true) <br>

## Class Diagram Controller
![Controller](https://github.com/helmy-faishal/tubes-pbo-inventory/blob/main/UML/Controller.png?raw=true) <br>

# Spesifikasi Database

![ERD Database](https://github.com/helmy-faishal/tubes-pbo-inventory/blob/main/UML/Database.png?raw=true) <br>
Agar program berjalan dengan lancar, diperlukan database seperti diagram diatas, database yang digunakan pada project ini adalah **MySQL**, untuk spesifikasi database antara lain
* Username = **root**
* Password = (Tidak ada)
* Nama Database = **tubespbo**
* Nama tabel = **barang** <br>

Untuk nama dan tipe data kolom pada tabel barang antara lain
1. **idBarang** : varchar(8)
2. **namaBarang** : varchar(255)
3. **deskripsiBarang** : varchar(255)
4. **jumlahBarang** : varchar(255)
5. **kategoriBarang** : varchar(255) <br>

Dapat juga menyalin kode sql dibawah untuk membuat Database dan Tabel <br>
```sql
/*Untuk membuat Database*/
CREATE DATABASE IF NOT EXISTS tubespbo;

/*Untuk membuat table*/
CREATE TABLE IF NOT EXISTS barang (
    idBarang varchar(8) NOT NULL,
    namaBarang varchar(255) NOT NULL,
    deskripsiBarang varchar(255) NOT NULL,
    jumlahBarang varchar(255) NOT NULL,
    kategoriBarang varchar(255) NOT NULL
);
```
