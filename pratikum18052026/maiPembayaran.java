/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktek18052026;

import java.util.Scanner;
public class maiPembayaran {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        //Deklarasi variabel objek dengan inisialisasi nilai awal null
        Pembayaran pembayaran =null;
        
        System.out.println("-----Sistem Pembayaran Toko Online-----");
        System.out.println("Masukkan ID  Transaksi=");
        String id = scanner.nextLine();
        
        System.out.println("Masukkan Jumlah Bayar=");
        double jumlah = scanner.nextDouble();
        
        System.out.println("Pilih Metode Pembayaran : ");
        System.out.println("1. Transfer Bank");
        System.out.println("2. Kartu Kredit");
        System.out.println("3. E-wallet");
        System.out.print("Pilih Metode Pembayaran Anda (1/2/3)");
        int pilihan=scanner.nextInt();
        scanner.nextLine();
        
        switch(pilihan){
            case 1 : System.out.println("Metode Transfer Bank");
                     System.out.println("Masukkan Nama Bank Tujuan");
                     String bank=scanner.nextLine();
                     pembayaran = new pembayaranTransfer(bank,jumlah,id);
                     break;
            case 2 : System.out.println("Metode Kartu Kredit");
                     System.out.println("Masukkan Nomor Kartu Tujuan");
                     String kartuKredit=scanner.nextLine();
                     pembayaran = new pembayaranTransfer(kartuKredit,jumlah,id);
                     break;
            case 3 : System.out.println("Metode E-Wallet");
                     System.out.println("Masukkan E-Wallet Tujuan");
                     String Ewallet=scanner.nextLine();
                     pembayaran = new pembayaranTransfer(Ewallet,jumlah,id);
                     break;
        }
        System.out.println("\n==Konfirmasi Bukti Pembayaran===");
        pembayaran.prosesPembayaran();
    }
    
}
