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
public class two_dim_array {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int i,j;
        int m = input.nextInt();
        int n = input.nextInt();
        int [][] a = new int [m][n];
        int [][] b = new int [m][n];
        int [][] c = new int [m][n];
        for ( i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                System.out.println("input a matrix");
                a[i][j]=input.nextInt();
                System.out.println("input b matrix");
                b[i][j]=input.nextInt();
                
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
          System.out.print("B=");
           for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("\t "+b[i][j]);
                
            }
              System.out.println("\n");
             
        }
           System.out.println("----------------------");
           
           System.out.println("Result of Addition");
            System.out.print("C=");
           for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
               c[i][j]=a[i][j]+b[i][j];
                System.out.print("\t"+c[i][j]);
                
            }
              System.out.println("\n");
             
        }
           System.out.println("----------------------");
         
               System.out.println("Result of Subtraction");
            System.out.print("C=");
           for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
               c[i][j]=a[i][j]-b[i][j];
                System.out.print("\t"+c[i][j]);
                
            }
              System.out.println("\n");
             
        }
           System.out.println("----------------------");
               System.out.println("Result of Multiplication");
            System.out.print("C=");
           for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
               c[i][j]=a[i][j]*b[i][j];
                System.out.print("\t"+c[i][j]);
                
            }
              System.out.println("\n");
             
        }
           System.out.println("----------------------");
               System.out.println("Result of Division");
            System.out.print("C=");
           for (i = 0; i <m; i++) {
            for (j = 0; j < n; j++) {
               c[i][j]=a[i][j]/b[i][j];
                System.out.print("\t"+c[i][j]);
                
            }
              System.out.println("\n");
             
        }
           System.out.println("----------------------");
           
    }
}
