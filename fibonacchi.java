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
public class fibonacchi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("select the length of sequence");
        int n = input.nextInt();
        int first =0;
        int second =1;
        int fibo;
        System.out.println(first+"\n"+second);
        for (int i = 3; i <=n; i++) {
            fibo = first + second;
            System.out.println(""+fibo);
            first=second;
            second =fibo;
        }
    }
}
