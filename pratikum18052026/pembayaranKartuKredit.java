/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek18052026;

/**
 Putri Kholiwiyah Siregar
 Teknik Komputer 1 A
 */
public class pembayaranKartuKredit extends Pembayaran {
    private String nomorKartu;

    public pembayaranKartuKredit(double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void prosesPembayaran() {
       System.out.println("Pembayaran melalui Ewallet");
       System.out.println("Nomor Kartu" + nomorKartu);
       System.out.println("Id Transaksi" + idTransaksi);
       System.out.println("Jumlah Pembayaran" + jumlahBayar);
    }
    
    
}
