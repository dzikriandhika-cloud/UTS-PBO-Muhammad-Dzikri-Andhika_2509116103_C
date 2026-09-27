/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Cleaning extends Layanan {

    public Cleaning() {
        super("Cleaning Sepatu", 50000);
    }

    @Override
    public double hitungHarga() {
        return harga;
    }
}
