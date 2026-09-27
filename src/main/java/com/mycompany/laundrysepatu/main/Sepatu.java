/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Sepatu {
    private String merk;
    private String jenis;
    private String warna;

    public Sepatu(String merk, String jenis, String warna) {
        this.merk = merk;
        this.jenis = jenis;
        this.warna = warna;
    }

    public String getMerk() {
        return merk;
    }

    public String getJenis() {
        return jenis;
    }

    public String getWarna() {
        return warna;
    }

    public void tampilkanData() {
        System.out.println("Merk Sepatu    : " + merk);
        System.out.println("Jenis Sepatu   : " + jenis);
        System.out.println("Warna Sepatu   : " + warna);
    }
}