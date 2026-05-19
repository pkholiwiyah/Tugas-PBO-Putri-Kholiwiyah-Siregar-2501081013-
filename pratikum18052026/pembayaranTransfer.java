/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek18052026;

/**
 Putri Kholiwiyah Siregar
 Teknik Komputer 1 A
 */
public class pembayaranTransfer extends Pembayaran {
    private String namaBank;

    public pembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }
    @Override   
    public void prosesPembayaran() { 
        System.out.println("Pembayaran melalui Ewallet");
       System.out.println("Nama Bank tujuan" + namaBank);
       System.out.println("Id Transaksi" + idTransaksi);
       System.out.println("Jumlah Pembayaran" + jumlahBayar);
    }  
    
}
