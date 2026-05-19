/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Praktikum230426;

/**
 *
 * @author ACER
 */
public class MainBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Author Rin= new Author("Rinaaldi Munir", "rinaldi@gmail.com",'m');
        System.out.println(Rin);
        //Rinaldi Munir
        
        //test book
        
        Book dummyBook = new Book("Algoritma dan Pemrograman", Rin,98000, 99);
        System.out.println(dummyBook);// book's toString()
        //
        
        //test setters and getters
        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("name is: "+ dummyBook.getName());
        //
        System.out.println("price is: "+ dummyBook.getPrice());
        //
         System.out.println("author is: "+ dummyBook.getAuthor());
         //
         //
         System.out.println("author's name is:" + dummyBook.getAuthor().getName());
         //
          System.out.println("author's email is:" + dummyBook.getAuthor().getEmail());
         //
          System.out.println("author's gender is:" + dummyBook.getAuthor().getGender());
          //
          //
          Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee","peter@nowhere.com", 'm'),19.99,8);
          System.out.println(moreDummyBook);//
        
    }
    
}
