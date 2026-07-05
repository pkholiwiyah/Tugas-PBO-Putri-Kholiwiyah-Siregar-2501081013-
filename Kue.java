/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QUIZ_PutriKholiwiyah2501081013;

/**
 Putri Kholiwiyah Siregar 2501081013 Teknik Komputer 1 A
 */
public class Kue {
    private String idKue;
    private String namaKue;
    private int hargaJual;
    private int jumlahTersedia;
    private String kategori;

    public Kue(String idKue, String namaKue, int hargaJual, int jumlahTersedia, String kategori) {
        this.idKue = idKue;
        this.namaKue = namaKue;
        this.hargaJual = hargaJual;
        this.jumlahTersedia = jumlahTersedia;
        this.kategori = kategori;
    }

    public String getIdKue() {
        return idKue;
    }

    public void setIdKue(String idKue) {
        this.idKue = idKue;
    }

    public String getNamaKue() {
        return namaKue;
    }

    public void setNamaKue(String namaKue) {
        this.namaKue = namaKue;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getJumlahTersedia() {
        return jumlahTersedia;
    }

    public void setJumlahTersedia(int jumlahTersedia) {
        this.jumlahTersedia = jumlahTersedia;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public int hitungTotalNilaiPenjualan() {
        return jumlahTersedia * hargaJual;
    }

    public void tampilkanInformasi() {
        System.out.println("ID Kue          : " + idKue);
        System.out.println("Nama Kue        : " + namaKue);
        System.out.println("Kategori        : " + kategori);
        System.out.println("Harga Jual      : Rp " + hargaJual);
        System.out.println("Stok Tersedia   : " + jumlahTersedia);
        System.out.println("Total Potensi   : Rp " + hitungTotalNilaiPenjualan());
    }
}

    
