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
public class array_sum_avg {
    public static void main(String[] args) {
        int i;
        double sum =0;
        Scanner input = new Scanner(System.in);
         System.out.println("Enter the length of the array:");
      int length = input.nextInt();
      double [] myArray = new double[length];
      System.out.println("Enter the elements of the array:");

      for( i=0; i<myArray.length; i++ ) {
         myArray[i] = input.nextInt();
         //  sum=sum+myArray[i];
      }
      //System.out.println("sum resutlt :"+sum);

        System.out.println("output result :");
        for( i=0; i<myArray.length; i++ ) {
            System.out.println(""+myArray[i]);
           sum=sum+myArray[i];
      }
        System.out.println("sum resutlt :"+sum);
        double avg =sum/myArray.length;
        System.out.println("average :"+avg);
        //System.out.println(" average :"+sum/length);
       

      

       
   }
       
    }
    

