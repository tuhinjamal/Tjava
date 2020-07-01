/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package number_conversion;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class decimal_to_others {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a decimal number to convert it into other number system");
        int dec = input.nextInt();
         System.out.println("You entered :"+dec);
        String binary = Integer.toBinaryString(dec);
        System.out.println("Binary value of "+dec+" is :"+binary);
        
                String octal = Integer.toOctalString(dec);
        System.out.println("Octal value of "+dec+" is :"+octal);
        
                String hex = Integer.toHexString(dec);
        System.out.println("Hexadecimal value of "+dec+" is :"+hex);
                
    }
}
