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
public class diagonal_triangle_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;
        System.out.println("select row");
        int m = input.nextInt();
        System.out.println("select cloumn");
        int n = input.nextInt();
        int [][] a = new int [m][n];
        int diagonal=0;
        int upper_triangel=0;
        int lower_triangel=0;
        
          for ( i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("input a matrix");
                a[i][j]=input.nextInt();
                
            }
        
          
    }
          
           System.out.print("A=");
          for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("\t "+a[i][j]);
                
            }
              System.out.println("\n");
             
            
        }
           System.out.println("----------------------------");
    
    
     System.out.print("Sum of Diagonal=");
          for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                if(i==j){
                    diagonal=diagonal+a[i][j];
                    
                }
                
            }
              System.out.println("sum :"+diagonal);
             
            
        }
           System.out.println("----------------------------");
                System.out.print("Sum of Upper Triangle=");
          for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                if(i<j){
                    upper_triangel=upper_triangel+a[i][j];
                    
                }
                
            }
              System.out.println("sum :"+upper_triangel);
             
            
        }
           System.out.println("----------------------------");
           
           
                           System.out.print("Sum of lower Triangle=");
          for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                if(i>j){
                   lower_triangel=lower_triangel+a[i][j];
                    
                }
                
            }
              System.out.println("sum :"+lower_triangel);
             
            
        }
           System.out.println("----------------------------");
    
    
    
    
    }
    
    
    
}
