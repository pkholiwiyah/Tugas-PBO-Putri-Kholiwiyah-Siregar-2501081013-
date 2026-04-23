/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum230426;

/**
 *
 * @author ACER
 */
public class Author {
    private final String name ;
    private String email;
    private final  char gender;   //'m' or 'f'
    
    //Constructor a Author instance with the given inputs*/
    public Author(String name,String email, char gender){
        this.name =name;
        this.email=email;
        this.gender=gender;

    }
    
    //The public getters and setters for the private instance variables.
    //No setters for name
    //..............*/
    public String getName(){
        return name;
    }
    
     public String getEmail(){
        return email;
    }
     
    public char getGender(){
        return gender;
    }
    
    public void setEmail(String email){
        this.email =email;
    }
    
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}
