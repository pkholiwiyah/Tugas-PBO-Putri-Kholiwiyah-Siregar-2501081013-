/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum230426;

/**Nama : Putri Kholiwiyah Siregar
 * KELAS : TK1A
 * NIM : 2501081013
 */
public class Line {
    private Point begin;
    private Point end;

    // constructor 1
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    // constructor 2
    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    // getter
    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    // setter
    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    // 
    public double getLength() {
        return begin.distance(end);
    }

    // 
    public double getGradient() {
        int dx = end.getX() - begin.getX();
        int dy = end.getY() - begin.getY();
        return (double) dy / dx;
    }

    
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
}
    

