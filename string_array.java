/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class string_array {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
      //  n=n+1;
        String [] name = new String [n];
        for (int i = 0; i<n; i++) {
            name[i]= input.next();
            
        }
        
        for(String i : name){
            System.out.println(""+i);
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
