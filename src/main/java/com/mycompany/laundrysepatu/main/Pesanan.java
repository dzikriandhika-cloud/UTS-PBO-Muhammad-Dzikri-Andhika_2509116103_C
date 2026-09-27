/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Pesanan {
    private Pelanggan pelanggan;
    private Sepatu sepatu;
    private Layanan layanan;
    private String status;

    public Pesanan(Pelanggan pelanggan, Sepatu sepatu, Layanan layanan) {
        this.pelanggan = pelanggan;
        this.sepatu = sepatu;
        this.layanan = layanan;
        this.status = "Menunggu";
    }

    public void ubahStatus(String status) {
        this.status = status;
    }

    // Method Overloading
    public void tampilkanPesanan() {
        System.out.println("\n===== DETAIL PESANAN =====");
        pelanggan.tampilkanData();
        sepatu.tampilkanData();
        layanan.tampilkanlayanan();
        System.out.println("Total Harga    : Rp" + layanan.hitungHarga());
        System.out.println("Status         : " + status);
    }

    // Method Overloading
    public void tampilkanPesanan(String judul) {
        System.out.println("\n===== " + judul + " =====");
        tampilkanPesanan();
    }
}