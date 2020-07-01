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
public class max_min_array {
    public static void main(String[] args) {
        int i;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
      int length = input.nextInt();
      double [] myArray = new double[length];
      double max = myArray[0];
     
      System.out.println("Enter the elements of the array:");

      for( i=0; i<myArray.length; i++ ) {
         myArray[i] = input.nextInt();
         //  sum=sum+myArray[i];
      }
     
        for ( i = 1; i <myArray.length; i++) {
            if (max<myArray[i]) {
                
               max=myArray[i] ;
            }
           
        }
        System.out.println("maximum :"+max);
         double min = myArray[0];
      for ( i =1; i <myArray.length; i++) {
            
            if (min>myArray[i]) {
                
               min=myArray[i] ;
            }
        }
        
         System.out.println("minimum :"+min);

    
    
    }
    
}
