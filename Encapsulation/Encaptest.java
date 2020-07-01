/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author tuhin
 */
public class Encaptest {
    public static void main(String[] args) {
        Encap p1 = new Encap ();
        p1.name = "Tuhin";
        System.out.println("name is :"+p1.getName());
        p1.age =  29;
        System.out.println("age:"+p1.getAge());
        p1.talk();
    }
    
}
