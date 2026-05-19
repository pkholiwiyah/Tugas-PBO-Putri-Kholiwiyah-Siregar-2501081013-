/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum230426;

/**Nama : Putri Kholiwiyah Siregar
 * KELAS : TK1A
 * NIM : 2501081013
 */
public class MainLine {
    public static void main(String[] args) {

        // buat titik
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);

        // buat garis
        Line line = new Line(p1, p2);

        // tampilkan
        System.out.println(line);

        // panjang garis
        System.out.printf("Panjang garis: %.2f\n", line.getLength());

        // gradien
        System.out.printf("Gradien garis: %.2f\n", line.getGradient());

        // ubah titik
        line.setBegin(new Point(0, 0));
        line.setEnd(new Point(3, 4));

        System.out.println("\nSetelah diubah:");
        System.out.println(line);
        System.out.printf("Panjang baru: %.2f\n", line.getLength());
        System.out.printf("Gradien baru: %.2f\n", line.getGradient());
    }
}