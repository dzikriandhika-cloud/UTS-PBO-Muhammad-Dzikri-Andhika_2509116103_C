/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laundrysepatu.main;

public class Repaint extends Layanan {

    public Repaint() {
        super("Repaint Sepatu", 100000);
    }

    @Override
    public double hitungHarga() {
        return harga;
    }
}