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
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name ="Anis Ul Islam";
        t1.age  = 30;
        t1.qualification = "MSc in CSE";
        t1.display();
    }
}
