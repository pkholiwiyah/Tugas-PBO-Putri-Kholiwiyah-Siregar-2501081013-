/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum27042026;

/**
 *
 * @author LAB-SI-PC
 */
public class MainHewan {
    public static void main(String[] args) {
    classHewan hewanku=new classHewan("Makhluk Hidup");
    Kucing kucingku=new Kucing("Mahes");
    Anjing anjingku=new Anjing("Helly");
    
    System.out.println("Tampilkan akses Super class Hewan");
    hewanku.tampilkanNama();
    hewanku.bersuara();
    
    System.out.println("\nTampilkan akses Super class Kucing");
    kucingku.tampilkanNama();
    kucingku.bersuara();
    
    System.out.println("\nTampilkan akses Super class Kucing");
    anjingku.tampilkanNama();
    anjingku.bersuara();
    }  
}
