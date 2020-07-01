/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author tuhin
 */
public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "Najmul Alam";
        t1.age  = 30;
        t1.qualification = "MSc in Math";
        t1.displayInformation();
        
        System.out.println("----------------------");
        
        Teacher t2 = new Teacher();
        t1.name = "Imdad Ul Haque";
        t1.age  = 35;
        t1.qualification = "Warasatul Anmbia";
        t1.displayInformation();
    }
    
}
