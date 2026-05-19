/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktek18052026;

/**
 Putri Kholiwiyah Siregar
 Teknik Komputer 1 A
 */
public abstract class Transportasi {
     protected double biayaPembayaran;
     protected String namaPenumpang;

    public Transportasi(double biayaPembayaran, String namaPenumpang) {
        this.biayaPembayaran = biayaPembayaran;
        this.namaPenumpang = namaPenumpang;
    }

    public double getBiayaPembayaran() {
        return biayaPembayaran;
    }

    public void setBiayaPembayaran(double biayaPembayaran) {
        this.biayaPembayaran = biayaPembayaran;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }
     
}
