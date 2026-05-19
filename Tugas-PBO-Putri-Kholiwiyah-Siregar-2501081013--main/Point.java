/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum230426;

/**Nama : Putri Kholiwiyah Siregar
 * KELAS : TK1A
 * NIM : 2501081013
 */
public class Point {
    private int x;
    private int y;

    //
    public Point() {
        x = 0;
        y = 0;
    }

    // 
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // setter
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getXY() {
        return new int[]{x, y};
    }

    // 
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    //
    public double distance(Point another) {
        int dx = this.x - another.x;
        int dy = this.y - another.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // 
    public double distance(int x, int y) {
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

  
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}
    
    
    

