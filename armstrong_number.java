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
public class armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0 , r, temp, num;
        System.out.println("enter any number :");
         num = input.nextInt();
        temp = num;
        
        while(temp != 0){
            r = temp%10;
            sum =sum+r*r*r;
            temp = temp/10;
        }
        if (num==sum) {
            System.out.println(sum+" is a Armstrong  number");
            
        }else{
            System.out.println(sum+" is not a Armstrong number");
        }
    }
}
