/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class array_sort {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        int i;
        int m = input.nextInt();
        
        
        int [] a = new int [m];
        for ( i = 0; i <m; i++) {
           
                System.out.println("input a matrix");
                a[i]=input.nextInt();
                
                
            }
        
          
    
        
        Arrays.sort(a);
      
         for (i = 0; i <m; i++) {
            
                System.out.print("\t  in asscending order"+a[i]);
           
        }
         
        
    }
    
}
