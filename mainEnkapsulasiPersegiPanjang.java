/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersegiPanjangEnkapsulasi;

import Praktikum30Maret2026.PersegiPanjang;
import java.util.Scanner;
public class mainEnkapsulasiPersegiPanjang {
    public static void main(String[] args, String panjang, String lebar) {
     EnkapsulasiPersegiPanjang pp1 = new EnkapsulasiPersegiPanjang();
            int getpanjang = pp1.getpanjang();
            int getlebar= pp1.getlebar();
            int luas = pp1.getluas();
            System.out.println("Objek Persegi Panjang Pertama");
            System.out.println("Panjang   = "+panjang);
            System.out.println("Lebar     = "+lebar);
            System.out.println("Luas      = "+luas); 
            System.out.println("Keliling  = "+pp1.getkeliling()); 
            
            //Membuat Objek kedua Konstruktor 2 
            EnkapsulasiPersegiPanjang pp2 = new EnkapsulasiPersegiPanjang(10,5);
            luas = pp2.getluas();
            System.out.println("Objek Persegi Panjang Kedua");
            System.out.println("Panjang   = "+panjang);
            System.out.println("Lebar     = "+lebar);
            System.out.println("Luas      = "+luas); 
            System.out.println("Keliling  = "+pp2.getkeliling()); 
            
            //Membu objek Ketiga menggunakan konstruktor 
            Scanner input = new Scanner (System.in);
            System.out.println("Objek Persegi Panjang Ketiga");
            System.out.println("Panjang   = ");
            int pj = input.nextInt();
            System.out.println("Lebar     = ");
            int lb = input.nextInt();
            EnkapsulasiPersegiPanjang pp3 = new EnkapsulasiPersegiPanjang(pj,lb);
            System.out.println("Luas      = "+pp3.getluas()); 
            System.out.println("Keliling  = "+pp3.getkeliling()); 
            
    }
}
    
