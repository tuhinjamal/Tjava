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
public class Teacher extends Person {

    String qualification;
    
        void displayInformation(){
    
            display();
            System.out.println("Qualification :"+qualification);
    
        }
    
    
}
