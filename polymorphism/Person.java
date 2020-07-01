/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author tuhin
 */
public class Person {
    void display(){
        System.out.println("I'm a person");
    }
}

/*

befor we start to discuss about ploymorphism we need to clear more about 
    method overloading 
    dynamic method dispatch
        polymorphism = poly(many)+ morph(form) Greek word 
        there are two type of polymorphism 
            1. compile time / static polymorphism :  method overloading & constructor overloading
                                                     in this the compiler looks at the method signeture 
                                                     and decides which method to call at the compile time
            2. run time / dynamic polymorphism : metheod overriding 
                [method overriding is to override a superclass method again in subclass]
                why this is called run time polymorphism ?
                let's expalin by an example :
                    class Person--> method display 
                    class Teacher-> method display
                    class Test --> psvm--> Person object p1 --> p1.display();
                                           Teacher object t1 -->t1.display();
                      ** this is a normal thing let's see something different
                      class Test --> 
                                    psvm--> Person object p1 --> p1.display();
                                    Person t = new Teacher();
                                 or        p = new teacher();
                                    t.display();
                                    p.display();
                    ** here we made a super class variable and we reffered it to a sub class object 
                        it is called DYNAMIC METHOD DISPATCH [ reffering subclass object by a superclass variable]
                        which compiler will discover while run it that's why it's called run time polymorphism
                    
                    
         so what is polymorphism ?
         polymorphism is a mechanism whwere a parent class reference variable can take many form 
        (it can refer object from different classes)


                



*/