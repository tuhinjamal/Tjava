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
public class others_to_decimal {
    public static void main(String[] args) {
        int  num, binary_val, decimal_val = 0, base = 1, rem;
        Scanner input = new Scanner(System.in);
        System.out.println(" enter a binary number to convert it into decimal number system");
       
         num = input.nextInt();
         binary_val = num;
        while (num > 0)
    {
        rem = num % 10;
        decimal_val = decimal_val + rem * base;
        num = num / 10 ;
        base = base * 2;
        
    }
       
         String oct = "1010";
         String hex = "1010";
        System.out.println("binary is : "+binary_val);
        System.out.println("decimal is "+decimal_val);
        
        Integer dec1 = Integer.parseInt(oct, 8);
        System.out.println(""+dec1);
        Integer dec2 = Integer.parseInt(hex, 16);
        System.out.println(""+dec2);
    }
    
}
