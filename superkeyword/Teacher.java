/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superkeyword;

/**
 *
 * @author tuhin
 */
public class Teacher extends Person {
    
    Teacher(){
        super();
        System.out.println("Teacher constructor");
    
    }
    
    String name = "Asad mia";
    int age =35;
    String qualification = "MSc in CSE";
    @Override
    void display(){
        super.display();// calling a method by super keyword 
        System.out.println("qualification :"+qualification);
        System.out.println("name in super class :"+super.name); // calling a instance variable by super keyword
        System.out.println("age in super class :"+super.age); // calling a instance variable by super keyword
    
    }
}
