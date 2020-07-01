/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ReteurningValue_Mehtod_demo;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class rtn_value {
    public static void main(String[] args) {
        RetruningValueDemo ob1 = new RetruningValueDemo();
            Scanner input = new Scanner (System.in);
             int n = input.nextInt();
   /* int resutl = ob1.squere(n);
        System.out.println("squere of "+n+" is "+resutl);*/
    System.out.println("squere of "+n+" is "+ob1.squere(n));
    
    
    
    
    
    
    }
}
