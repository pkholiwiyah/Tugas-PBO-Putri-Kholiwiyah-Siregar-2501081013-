/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PutriKholiwiyah2501081013;

/**
 Putri Kholiwiyah Siregar 2501081013 Teknik Komputer 1 A
 */
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop(){
    }

    public int getUkuranLayar(){
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }

    public int getKapasitasRAM(){
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
}
