/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Layanan {
    protected String namalayanan;
    protected double harga;

    public Layanan(String namaLayanan, double harga) {
        this.namalayanan = namaLayanan;
        this.harga = harga;
    }

    public String getNamaLayanan() {
        return namalayanan;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungHarga() {
        return harga;
    }

    public void tampilkanlayanan() {
        System.out.println("Layanan        : " + namalayanan);
        System.out.println("Harga          : Rp" + harga);
    }
}