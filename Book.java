/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum230426;

/**
 *
 * @author ACER
 */
public class Book {
    //The private instance variables
    private final String name;
    private final Author author;
    private double price;
    private int qty;
    
    //Constroctor a Book instance with the given author */
    public Book(String name, Author author, double price, int qty){
        this.name=name;
        this.author=author;
        this.price=price;
        this.qty=qty;
    }
    
    
   //Getters and Settters
    /** Return the name of this book*/
    public String  getName(){
        return name;
    }
    
    /** Return the author*/
    public Author getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }

    public void setPrice(int par){
        this.price = price;
    }
            
    public int getQty(){
        return qty;
    }

    public void setQty(int qty){
    this.qty=qty;
    }

   public String toString(){
        return "Book[name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty + "]";
    }
}
