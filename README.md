# Sistem Manajemen Laundry Sepatu

## Deskripsi Proyek

Sistem Manajemen Laundry Sepatu merupakan program berbasis Java yang dibuat untuk membantu pengelolaan pesanan pada **Laundry Sepatu Dzikri**. Program ini memungkinkan pengguna untuk menambahkan data pelanggan dan sepatu, memilih jenis layanan, melihat detail pesanan, serta mengubah status pengerjaan laundry.

Program ini dibuat sebagai tugas UTS Pemrograman Berorientasi Objek (PBO) dengan menerapkan konsep dasar Object Oriented Programming (OOP).

## Fitur Program

Program memiliki beberapa fitur utama, yaitu:
- Menambahkan data pelanggan dan sepatu.
- Memilih layanan Cleaning atau Repaint.
- Menampilkan detail dan harga pesanan.
- Melihat data pesanan.
- Mengubah status pesanan menjadi Sedang Dicuci, Selesai, atau Sudah Diambil.

## Konsep PBO yang Digunakan

Program menerapkan beberapa konsep yang dipelajari dalam Pemrograman Berorientasi Objek, yaitu:

1. **Inheritance**
   Class `Cleaning` dan `Repaint` merupakan turunan dari class `Layanan`.

2. **Polymorphism - Method Overriding**
   Method `hitungHarga()` pada class `Layanan` di-override pada class `Cleaning` dan `Repaint`.

3. **Polymorphism - Method Overloading**
   Method `tampilkanPesanan()` pada class `Pesanan` dibuat dengan parameter yang berbeda.

4. **Condition (If-Else)**
   If-else digunakan untuk menentukan menu, jenis layanan, dan perubahan status pesanan.

5. **Looping**
   Perulangan `while` digunakan agar menu utama terus ditampilkan sampai pengguna memilih menu keluar.

## Alur Program

1. Program menampilkan menu utama Laundry Sepatu Dzikri.
2. Pengguna memilih menu Tambah Pesanan.
3. Pengguna memasukkan nama pelanggan dan nomor HP.
4. Pengguna memasukkan merk, jenis, dan warna sepatu.
5. Pengguna memilih layanan Cleaning atau Repaint.
6. Sistem membuat dan menampilkan detail pesanan.
7. Pengguna dapat melihat kembali data pesanan melalui menu Lihat Pesanan.
8. Pengguna dapat mengubah status pesanan melalui menu Ubah Status Pesanan.
9. Program akan terus berjalan sampai pengguna memilih menu Keluar.

## Dokumentasi Output

### 1. Menu Utama
Program menampilkan menu utama yang terdiri dari Tambah Pesanan, Lihat Pesanan, Ubah Status Pesanan, dan Keluar.



### 2. Tambah Pesanan
Pengguna memasukkan data pelanggan, data sepatu, dan memilih jenis layanan. Setelah data berhasil dimasukkan, sistem menampilkan detail pesanan.



### 3. Lihat Pesanan
Menu Lihat Pesanan digunakan untuk menampilkan data pesanan yang telah dibuat. Status awal pesanan adalah "Menunggu".


### 4. Ubah Status Pesanan
Pengguna dapat mengubah status pesanan menjadi Sedang Dicuci, Selesai, atau Sudah Diambil. Pada contoh ini, status pesanan diubah menjadi "Selesai".



### 5. Hasil Perubahan Status
Setelah status diubah, menu Lihat Pesanan menampilkan status terbaru yaitu "Selesai".

## Cara Menjalankan Program

1. Clone atau download repository ini.
2. Buka project menggunakan Apache NetBeans.
3. Pastikan Java telah terinstal.
4. Jalankan file `LaundrysepatuMain.java`.
5. Pilih menu yang tersedia dengan memasukkan angka 1-4.
6. Ikuti instruksi yang ditampilkan pada console.

## Struktur Class

- `LaundrysepatuMain.java` - Main program dan menu utama.
- `Pelanggan.java` - Menyimpan data pelanggan.
- `Sepatu.java` - Menyimpan data sepatu.
- `Layanan.java` - Parent class untuk layanan laundry.
- `Cleaning.java` - Child class untuk layanan cleaning.
- `Repaint.java` - Child class untuk layanan repaint.
- `Pesanan.java` - Mengelola data dan status pesanan.
