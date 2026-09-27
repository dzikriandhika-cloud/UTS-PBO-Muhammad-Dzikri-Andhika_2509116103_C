/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Pelanggan {
    private String nama;
    private String noHP;

    public Pelanggan(String nama, String noHP) {
        this.nama = nama;
        this.noHP = noHP;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHP() {
        return noHP;
    }

    public void tampilkanData() {
        System.out.println("Nama Pelanggan : " + nama);
        System.out.println("No. HP         : " + noHP);
    }
}
