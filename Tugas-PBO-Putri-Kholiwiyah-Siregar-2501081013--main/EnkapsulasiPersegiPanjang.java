/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PersegiPanjangEnkapsulasi;

/**
 * PutriKholiwiyah siregar (2501081013)
 */
public class EnkapsulasiPersegiPanjang {
    private int panjang;
    private int lebar;
    private int jumlahObjek = 0;
    
    public EnkapsulasiPersegiPanjang(){
        jumlahObjek++;    
}

    public EnkapsulasiPersegiPanjang(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar= lebar;
        jumlahObjek++; 
    }
//  GETTER & SETTER
    public void getpanjang(int panjang){
        this.panjang = 20;
    }
    public int getPanjang(){
        return panjang;
    }
    public void setpanjang(int lebar){
        this.lebar = 40;
    }
    public int getlebar(){
        return lebar;
    }
    public int getjulahObjek(int lebar){
        return jumlahObjek;
    }
     public int getluas(){
        return(panjang*lebar);
    }
      public int getkeliling(){
        return (2*panjang+2*lebar);
    }

    int getpanjang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}