/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1.constructor_method;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class constructor_teacher {
    
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name");
        String n = input.nextLine();
        System.out.println("Type your gender");
        String g =input.nextLine();
        System.out.println("give your phone number");
        int p = input.nextInt();
        Tea_cher teacher1 = new Tea_cher(n,g,p);
       
       
        
        

        teacher1.displayInformation();
        
        Tea_cher teacher2 = new Tea_cher("Maryam Akhter","FEMALE");
        teacher2.displayInformation();
        
        Tea_cher teacher3 = new Tea_cher();
        teacher3.displayInformation();
        
        
    }
    }
    
    

