/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Putri_2501081013;

import Pratikum09042026.MahasiswaEnkapsulasi2;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainEnkapsulasiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        //constructor kosong
        
        System.out.println(" Object 1 ");
        MainEnkapsulasiMahasiswa  mhs1 = new MainEnkapsulasiMahasiswa(nama, nim, jurusan, umur, ipk);
        mhs1.setNama("Putri Kholiwiyah Siregar");
        mhs1.setNim("2501081013");
        mhs1.setJurusan("Teknik Komputer");
        mhs1.setUmur(19);
        mhs1.setIpk(3.7);
        mhs1.tampilInfo();
        System.out.println("Status Kelulusan: " + MainEnkapsulasiMahasiswa.statusKelulusan());

        System.out.println();

        //constructor 2 
        System.out.println("Object 2");
        MainEnkapsulasiMahasiswa  mhs2 = new MainEnkapsulasiMahasiswa ("Nur Ainun", "2501083011");
        mhs2.setJurusan("Managemen Informatika");
        mhs2.setUmur(18);
        mhs2.setIpk(3.6);
        mhs2.tampilInfo();
        System.out.println("status Kelulusan: " + statusKelulusan());

        System.out.println();

    
        System.out.println("Object 3 (Input User)");
        
        System.out.print("Nama : ");
        String nama = input.nextLine();
        
        System.out.print("NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();
        
        System.out.print("Umur: ");
        int umur = input.nextInt();
        
        System.out.print("IPK: ");
        double ipk = input.nextDouble();

        MainEnkapsulasiMahasiswa mhs3 = new MainEnkapsulasiMahasiswa(nama, nim, jurusan, umur, ipk);
        mhs3.tampilInfo();
        System.out.println("Status Kelulusan: " + MainEnkapsulasiMahasiswa.statusKelulusan());
    }

    private static String statusKelulusan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private MainEnkapsulasiMahasiswa(String nama, String nim, String jurusan, int umur, double ipk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private MainEnkapsulasiMahasiswa(String nur_Ainun, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setNama(String putri_Kholiwiyah_Siregar) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setNim(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setJurusan(String teknik_Komputer) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setUmur(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setIpk(double d) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void tampilInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
    

