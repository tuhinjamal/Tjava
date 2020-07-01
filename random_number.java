/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random_number;

import java.util.Random;

/**
 *
 * @author tuhin
 */
public class random_number {
    public static void main(String[] args) {
        //Random rand = new Random();
        //int randomnumber = rand.nextInt(10);
        
        int randomnumber = (int)(Math.random()*10);
        
         System.out.println(""+randomnumber);
    }
    
}
