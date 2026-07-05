/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PutriKholiwiyah2501081013;

/**
 Putri Kholiwiyah Siregar 2501081013 Teknik Komputer 1 A
 */
import java.util.Scanner;

public class ElektronikDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Gaming gamingLaptop = new Gaming();

        System.out.println("===INPUT DATA LAPTOP GAMING===");
        System.out.print("Masukkan Merek: ");
        gamingLaptop.setMerek(scanner.nextLine());

        System.out.print("Masukkan Tahun Produksi: ");
        gamingLaptop.setTahunProduksi(scanner.nextInt());

        System.out.print("Masukkan Masa Garansi: ");
        gamingLaptop.setGaransi(scanner.nextInt());

        System.out.print("Masukkan Ukuran Layar: ");
        gamingLaptop.setUkuranLayar(scanner.nextInt());

        System.out.print("Masukkan Kapasitas RAM: ");
        gamingLaptop.setKapasitasRAM(scanner.nextInt());
        scanner.nextLine(); 

        System.out.print("Masukkan Kartu Grafis: ");
        gamingLaptop.setKartuGrafis(scanner.nextLine());

        System.out.print("Masukkan Refresh Rate: ");
        gamingLaptop.setRefreshRate(scanner.nextInt());
        
        System.out.println("\n===DATA LAPTOP GAMING===");
        System.out.println("Merek: " + gamingLaptop.getMerek());
        System.out.println("Tahun Produksi: " + gamingLaptop.getTahunProduksi());
        System.out.println("Garansi: " + gamingLaptop.getGaransi() + " tahun");
        System.out.println("Ukuran Layar: " + gamingLaptop.getUkuranLayar() + " inci");
        System.out.println("Kapasitas RAM: " + gamingLaptop.getKapasitasRAM() + " GB");
        System.out.println("Kartu Grafis: " + gamingLaptop.getKartuGrafis());
        System.out.println("Refresh Rate: " + gamingLaptop.getRefreshRate() + " Hz");
        scanner.close();
    }
}