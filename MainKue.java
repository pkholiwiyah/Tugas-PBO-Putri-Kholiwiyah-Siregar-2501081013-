/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QUIZ_PutriKholiwiyah2501081013;

/**
 Putri Kholiwiyah Siregar 2501081013 Teknik Komputer 1 A
 */
public class MainKue {
    public static void main(String[] args){
        Kue kueUtama = new Kue("K001", "Lapis Legit", 150000, 10, "Bika Ambon");
        kueUtama.tampilkanInformasi();
        kueUtama.setJumlahTersedia(15);
        kueUtama.setHargaJual(155000);
        
        System.out.println("===SETELAH UPDATE STOK & HARGA===");
        kueUtama.tampilkanInformasi();
    }
}