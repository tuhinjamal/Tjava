/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic.loop;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class for_each_loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select the length of array");
       
        int n = input.nextInt();
        /*String [] name = new String[n+1];
        for (String x : name) {
            x=input.nextLine();
        
            System.out.println(""+x);
        }*/
        int [] number = new int [n];
        for( int x :number){
            
            x=input.nextInt();
            System.out.println(""+x);
        }
        
         
        
       
        
    }
}
