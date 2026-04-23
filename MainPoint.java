/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum230426;

/**Nama : Putri Kholiwiyah Siregar
 * KELAS : TK1A
 * NIM : 2501081013
 */
public class MainPoint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Jarak p1 ke (0,0): " + p1.distance());
        System.out.println("Jarak p1 ke p2: " + p1.distance(p2));
        System.out.println("Jarak: " + (int)p1.distance(10,10));
    }
    
    
}
