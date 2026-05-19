/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Putri Kholiwiyah Siregar
 * 2501081013
 * Teknik Komputer
 */
import java.util.Scanner;
public class mainTransfortasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Deklarasi variabel objek dengan inisialisasi nilai awal null 
        Transportasi transportasi = null;
        
        System.out.println("=====Sistem Informasi Transportasi=====");
        System.out.print("Masukkan Nama Penumpang = ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan Tujuan = ");
        String tujuan = scanner.nextLine();
        
        System.out.println("\nPilih Jenis Transportasi : ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Kereta");
        System.out.println("4. Bis");
        System.out.print("Pilih Jenis Transportasi Anda (1/2/3/4): ");
        int pilihan = scanner.nextInt();
      
        switch(pilihan) {
            case 1:
                transportasi = new Mobil(nama, tujuan);
                break;
            case 2:
                transportasi = new Motor(nama, tujuan);
                break;
            case 3:
                transportasi = new Kreta(nama, tujuan);
                break;
            case 4:
                transportasi = new Bis(nama, tujuan);
                break;
        }
        
        System.out.println("\n=====Biaya Perjalan=====");
           transportasi.tampilkanOutput();
        }
       
    }

    
