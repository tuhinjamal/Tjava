/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic.array;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class array_output_2 {
    public static void main(String[] args) {
          Scanner input = new Scanner (System.in);
        int i,j;
        int k=0;
        System.out.println("select row");
        int m = input.nextInt();
        System.out.println("select cloumn");
        int n = input.nextInt();
        int [][] a = new int [m][n];
        for ( i = 0; i <m; i++) {
            for ( j = 0; j <i+1; j++) {
                a[i][j]=k;
                k++;
                
                
            }
            
        }
        
         for ( i = 0; i <m; i++) {
            for ( j = 0; j < i+1; j++) {
                System.out.print(a[i][j]+"  ");
               
                
                
            }
             System.out.println("\n");
            
        }
    }
       
    
}
