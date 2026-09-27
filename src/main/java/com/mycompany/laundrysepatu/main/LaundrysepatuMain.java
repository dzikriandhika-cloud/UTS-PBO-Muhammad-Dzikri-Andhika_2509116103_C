/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laundrysepatu.main;

import java.util.Scanner;

public class LaundrysepatuMain {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Pesanan pesanan = null;

        int pilihan = 0;

        // LOOPING
        while (pilihan != 4) {

            System.out.println("\n==============================");
            System.out.println("   LAUNDRY SEPATU Dzikri");
            System.out.println("==============================");
            System.out.println("1. Tambah Pesanan");
            System.out.println("2. Lihat Pesanan");
            System.out.println("3. Ubah Status Pesanan");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();
            input.nextLine();

            // CONDITION IF-ELSE
            if (pilihan == 1) {

                System.out.println("\n--- TAMBAH PESANAN ---");

                System.out.print("Nama Pelanggan : ");
                String nama = input.nextLine();

                System.out.print("No. HP         : ");
                String noHP = input.nextLine();

                System.out.print("Merk Sepatu    : ");
                String merk = input.nextLine();

                System.out.print("Jenis Sepatu   : ");
                String jenis = input.nextLine();

                System.out.print("Warna Sepatu   : ");
                String warna = input.nextLine();

                Pelanggan pelanggan = new Pelanggan(nama, noHP);
                Sepatu sepatu = new Sepatu(merk, jenis, warna);

                System.out.println("\nPilih Layanan:");
                System.out.println("1. Cleaning Sepatu - Rp50.000");
                System.out.println("2. Repaint Sepatu  - Rp100.000");
                System.out.print("Pilihan: ");

                int pilihLayanan = input.nextInt();
                input.nextLine();

                Layanan layanan;

                if (pilihLayanan == 1) {
                    layanan = new Cleaning();
                } else if (pilihLayanan == 2) {
                    layanan = new Repaint();
                } else {
                    System.out.println("Pilihan tidak tersedia.");
                    continue;
                }

                pesanan = new Pesanan(pelanggan, sepatu, layanan);

                System.out.println("\nPesanan berhasil ditambahkan!");
                pesanan.tampilkanPesanan();

            } else if (pilihan == 2) {

                if (pesanan != null) {
                    pesanan.tampilkanPesanan("DATA PESANAN");
                } else {
                    System.out.println("\nBelum ada pesanan.");
                }

            } else if (pilihan == 3) {

                if (pesanan != null) {

                    System.out.println("\n--- UBAH STATUS ---");
                    System.out.println("1. Sedang Dicuci");
                    System.out.println("2. Selesai");
                    System.out.println("3. Sudah Diambil");
                    System.out.print("Pilih status: ");

                    int pilihStatus = input.nextInt();
                    input.nextLine();

                    if (pilihStatus == 1) {
                        pesanan.ubahStatus("Sedang Dicuci");
                    } else if (pilihStatus == 2) {
                        pesanan.ubahStatus("Selesai");
                    } else if (pilihStatus == 3) {
                        pesanan.ubahStatus("Sudah Diambil");
                    } else {
                        System.out.println("Pilihan status tidak tersedia.");
                        continue;
                    }

                    System.out.println("Status berhasil diubah!");

                } else {
                    System.out.println("\nBelum ada pesanan.");
                }

            } else if (pilihan == 4) {

                System.out.println("\nTerima kasih telah menggunakan sistem.");
                System.out.println("Program selesai.");

            } else {

                System.out.println("\nMenu tidak tersedia.");
            }
        }

        input.close();
    }
}