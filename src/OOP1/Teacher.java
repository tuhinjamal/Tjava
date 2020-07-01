/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

/**
 *
 * @author tuhin
 */
public class Teacher {
    
    //there are two things that can be used in a class 1. instance variable 2. method
    
    
    String name,gender;
    int phone;
    
    
    void setInoformation(String n, String g, int p){
    
        name = n;
        gender = g;
        phone = p;
    
    
    }
    
    
    void displayInformation(){
        
        //method example
                System.out.println("Name : "+name);
        System.out.println("Genger : "+gender);
        System.out.println("Phone : "+phone);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   

}