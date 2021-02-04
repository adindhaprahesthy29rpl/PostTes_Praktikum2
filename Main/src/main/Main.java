/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author MOKLET-2
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        //object
        Pohon cemara = new Pohon();
        Pohon kelapa = new Pohon();
  
        //Menjalankan Method
        System.out.println("TAMPILKAN POHON CEMARA");
        System.out.println("======================");
        cemara.setNama();
        cemara.setTinggi();
        cemara.getNama();
        cemara.getTinggi();
        System.out.println(" ");
        
        System.out.println("TAMPILKAN POHON KELAPA");
        System.out.println("======================");
        kelapa.setNama();
        kelapa.setTinggi();
        cemara.getNama();
        cemara.getTinggi();


    }
    
}
