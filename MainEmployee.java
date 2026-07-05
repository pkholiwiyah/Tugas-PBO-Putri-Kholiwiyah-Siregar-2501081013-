/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QUIZ_PutriKholiwiyah2501081013;

/**
 Putri Kholiwiyah Siregar 2501081013 Teknik Komputer 1 A
 */
public class MainEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(250101, "Putri", "Kholiwiyah", 7500000);
        
        System.out.println("Data Awal:");
        System.out.println(emp.toString());
        System.out.println("Gaji Tahunan: Rp " + emp.getAnnualSalary());
        System.out.println("\nMelakukan Kenaikan Gaji Sebesar 10%");
        int gajiBaru = emp.raiseSalary(10);
        System.out.println("Gaji Bulanan Baru: Rp " + gajiBaru);
        System.out.println("Data Terbaru:");
        System.out.println(emp.toString());
    }
}
