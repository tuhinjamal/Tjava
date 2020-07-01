/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP1;

import java.util.Scanner;


/**
 *
 * @author tuhin
 */
public class teacher_objecet {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter your name");
        String n = input.nextLine();
        System.out.println("Type your gender");
        String g =input.nextLine();
        System.out.println("give your phone number");
        int p = input.nextInt();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        
        
        teacher1.setInoformation(n,g,p);
        teacher1.displayInformation();

        
        System.out.println("-------------------------------------------------");
                    teacher2.setInoformation("Maryam Akhter","MALE", 1677634402);
                    teacher2.displayInformation();
        
        
    }
    
}
