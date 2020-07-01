/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acs_modifier;

/**
 *
 * @author tuhin
 */
public class A {
    private void dis(){
    
        System.out.println("you can't use this method from any other class or package by any mean except this package");
    
    }
    public void display(){
    
        System.out.println("hi!");
    
    }
    protected void disp(){
    
        System.out.println("this method can be used in any class from same package \n but have to inherit if you want to use from anthor package ");
    
    }
    void displ(){
        System.out.println("default package only can be use in any class from same package");
    
    }
    
}

/*

                        MODIFIER
                            |
               |                        |
        ACCESS MODIFIER       NONE ACCESS MODIFIER
           PRIVATE                  STATIC
           PUBLIC                   ABSTRACT
           PROTECTED                VOLATILE
           DEFAULT                  ETC.

*/
