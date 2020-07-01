/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.StringBuffer;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class string_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String s1 = input.nextLine();
        System.out.println(s1);
        StringBuffer sb = new StringBuffer(s1);
        String s2 = sb.reverse().toString();
        if (s1.equals(s2)) {
            
            System.out.println(s1+" is a palindrome string ");
            
        }else{
        
            System.out.println(s2+" is not a palidrome");
        
        }
        
    }
    
}
