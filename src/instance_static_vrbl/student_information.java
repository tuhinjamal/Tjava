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
public class student_information {
    public static void main(String[] args) {
        Student s1 = new Student("Aziz",101);
        Student s2 = new Student("Zahid",102);
        
        
        s1.displayinformation();
        s2.displayinformation();
        //static variable doesn't require any object to use 
        System.out.println("University :"+Student.universityname);
    }
    
}
