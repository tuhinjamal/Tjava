/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instance_static_vrbl;

/**
 *
 * @author tuhin
 */
public class Student {
    // name and id are instance variable and unversity name is a static variable
    String name;
    int id;
    static String universityname ="SU";
    
    Student(String n, int i){
    
        name = n;
        id = i;
    
    }
    
    void displayinformation(){
    
        System.out.println("Name :"+name);
        System.out.println("ID :"+id);
        System.out.println("University name :"+universityname);
    
    }
    }
    
    
    

