/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek18052026;

/**
 *Putri Kholiwiyah Siregar
 *2501081013
 * Teknik Komputer 1 A
 */
public class pembayaranEWallet extends Pembayaran {

    public pembayaranEWallet(String namaEwallet, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaEwallet = namaEwallet;
    }
    private String namaEwallet;

    public String getNamaEwallet() {
        return namaEwallet;
    }

    public void setNamaEwallet(String namaEwallet) {
        this.namaEwallet = namaEwallet;
    }
    
   
    @Override
    public void prosesPembayaran(){
        System.out.println("Pembayaran melalui Ewallet");
        System.out.println("E-Wallet" + namaEwallet);
        System.out.println("Id Transaksi" + idTransaksi);
        System.out.println("Jumlah Pembayaran" + jumlahBayar);
        
    }
}
