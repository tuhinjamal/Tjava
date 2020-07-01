/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class rectest {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("input a number to get it's factorial value ");
        int x = input.nextInt();
        Rec r = new Rec();
       int result = r.factorial(x);
    
        System.out.println("factorial of "+x+ "is : "+result);
    }
}
// if else are selection structure and loops are iteration structure and 
// recursion terminates when base case satisfied and iteration terminates when the condition fails
//recursion slow and iteration fast
// recursion code smaller then iteraion 
