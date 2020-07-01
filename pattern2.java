/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic.pattern;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class pattern2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of lines");
        int n =input.nextInt();
        for (int row = n; row >=1; row--) {
            for (int col = 1; col <=row; col++) {
                System.out.print(""+col);
            }
            System.out.println();
    }
    }
       
    
}
