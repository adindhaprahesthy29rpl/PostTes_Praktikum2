/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Pohon {
    
    //Inisialisasi Object Input dari Class Scanner
    Scanner input = new Scanner(System.in);
    
    //Variabel Instance
    private String nama;
    private int tinggi;
    
    //Method Untuk Setting Nama 
    public void setNama() {
        System.out.print("Masukkan Nama Pohon : ");
        nama = input.next();
    }
    
    //Method Untuk Setting Tinggi
    public void setTinggi() {
        System.out.print("Masukkan Tinggi Pohon : ");
        tinggi = input.nextInt();
    }
    
    //Method Untuk Mengembalikan Nama
    public String getNama() {
        return nama;//Mengembalikan Nama
    }
    
    //Method Untuk Mengembalikan Tinggi
    public int getTinggi() {
        return tinggi;//Mengembalikan Tinggi
}
}
