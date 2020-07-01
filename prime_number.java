/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class prime_number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count =0;
        int num = input.nextInt();
        for (int i = 2; i <=num ; i++) {
            
        if (num%2==0) {
            count++;
           
            break;
            
            }
        }
        if (count==0) {
            System.out.println(+num+" is a prime number");
            
        }else{
            System.out.println(+num+" is not a prime number");
        }
    }
    
}
