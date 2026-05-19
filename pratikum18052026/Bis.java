/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Putri Kholiwiyah Siregar
 * 2501081013
 * Teknik Komputer
 */
public class Bis extends Transportasi{
    private double biayaPerjalan;

    public Bis(String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.biayaPerjalan = biayaPerjalan;
    }
    
    public double getBiayaPerjalan() {
        return biayaPerjalan;
    }

    public void setBiayaPerjalan(double biayaPerjalan) {
        this.biayaPerjalan = biayaPerjalan;
    }
    
    @Override
    public void tampilkanOutput(){
        System.out.println("Jenis Transportasi : Bis");
        System.out.println("Nama Penumpang : "+namaPenumpang);
        System.out.println("Tujuan Penumpang : "+tujuan);
        System.out.println("Biaya Perjalanan : "+biayaPerjalan); 
    }
}
