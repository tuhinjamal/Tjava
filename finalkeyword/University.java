/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalkeyword;

/**
 *
 * @author tuhin
 */
final public class University {         //final class can't be inherited by another class
    
    final String UNIVERSITY_NAME = "SONARGOAN UNIVERSITY";//final variable 
    final int fees; 
    static int semester;
    //blank final variable which can be  initialize by a constructor in further
    University(){
    
        fees = 17000;
    }
    static{
        
        semester = 12;
        
    }
    
    final void display(){               // final method can't be override
        System.out.println("University name :"+UNIVERSITY_NAME);
        System.out.println("fees :"+fees);
        System.out.println("semester :"+semester);
    }
    
    
    
}


        /*
        types of final keyword
        1. final variable
        2.final method
        3.final class
        **final variable are 3 types 
            1.final variable
            2.blank final variable
            3.static blank final variable



        */
