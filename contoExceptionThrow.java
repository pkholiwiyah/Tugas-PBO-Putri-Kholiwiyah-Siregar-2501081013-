/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 Putri Kholiwiyah (2501081013) Teknik Komputer 1 A
 */
package Praktikum08062026;

import java.util.Scanner;

public class contoExceptionThrow {
public static void cekNilai(int nilai)throws Exception{
        if(nilai<0){
            throw new Exception("Nilai tidak oleh negatif");
        }
        else if(nilai>100){
            throw new Exception("Maksimum 100");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Masukkan sebuah angka = ");
            int angka = input.nextInt();

        }catch(Exception e){
            
        }
}
