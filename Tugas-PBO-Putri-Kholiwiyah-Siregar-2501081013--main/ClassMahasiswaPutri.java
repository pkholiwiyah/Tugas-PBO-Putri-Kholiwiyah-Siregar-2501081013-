/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Putri_2501081013;

/**
 *
 * @author ACER
 */
public class ClassMahasiswaPutri {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private double ipk;

    // Constructor kosong
    public ClassMahasiswaPutri() {

    }

    // Constructor 2 parameter
    public ClassMahasiswaPutri(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Constructor lengkap
    public ClassMahasiswaPutri (String nama, String nim, String jurusan, int umur, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.umur = umur;
        this.ipk = ipk;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getUmur() {
        return umur;
    }

    public double getIpk() {
        return ipk;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }

    // Method tampil info
    public void tampilInfo() {
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Umur     : " + umur);
        System.out.println("IPK      : " + ipk);
    }

    String statusKelulusan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


