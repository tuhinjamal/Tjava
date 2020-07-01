/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mthd_overriding;

/**
 *
 * @author tuhin
 */
public class Teacher extends Person {
    
    String qualification ;
    @Override
    void display(){
        System.out.println("name :"+name);
        System.out.println("age :"+age);
        System.out.println("qualification :"+qualification);
    
    }
}

// declaring a method in subclass which is already present in superclass is called method override
/*
    importance of override
        1. code reuse
        2.one interface multiple implement
        3.run time polymorphism


    rules of method overriding 
        
        name , signeture , paremetertype must be same .
        no inherit no override
        static method can be overriden because static method bound to class but method bound to object
        constructor can't be overriden
        main method can't be override because it's a static method
        

            difference between method overloading and overriding
            
            --------------overload--------------------||-----------------override------------------------
            
parameter  : must be different                         || must be same
occuer     : in same  class                            || between two class sub and super class
inheritance: no need                                   || need 
return type: no need to be same                        || same
hide       :one method does not hide another           || child method hides parent method



why java doesn't support multiple inheritence ?
when both class are in same level with same priority 
if we want to use foo() mtheod that from D class object leads to ambigity
this is called diamond problem

example :
 Public class A(){
        
        void foo(){
        }
}

Public class B extends A(){
        
        void foo(){
        }
}
Public class C extends A(){
        
        void foo(){
        }
}

Public class D extends B,C(){
        
        void foo(){
        }
}

Public class Test{


    public static void main(String [] args){

        D ob = new D();
        ob.foo(); //ambiguity marks here error

    }

}
*/
