/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package basic.array;

/**
 *
 * @author tuhin
 */
public class array_basic {
    public static void main(String[] args) {
        int [] number = new int [5];
        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;
        
        int sum = number[0]+number[1]+number[2]+number[3]+number[4];
        int len = number.length;
        System.out.println("sum of array :"+sum);
        System.out.println("Array size =" +len);
        System.out.println(number[0]+number[2]);
    }
    
        
    
}
