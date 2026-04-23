/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum230426;

/**
 *
 * @author ACER
 */
public class MainAuthor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author Rin=new Author("Rinaldi Munir", "rinmunir@gmail.com",'m');
        System.out.println(Rin); //toString()
        //tan ah teck
        
        //tan Setters an Getters
        Rin.setEmail("rinaldi@gmail.com");
        System.out.println(Rin); //toString
        //Rinaldi Munir (m) at rinaldi@gmail.com
        System.out.println("name is: " +Rin.getName());
        //name is: Rinaldi Munir
        System.out.println("gender is : "+ Rin.getGender());
        //gender is :m
        System.out.println("email is: " + Rin.getEmail());
        //email is: rinaldi@gmail.com
    }
    
}
