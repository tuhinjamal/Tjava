/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_list;

import java.util.ArrayList;

/**
 *
 * @author tuhin
 */
public class array_list_basic_2 {
    public static void main(String[] args) {
        ArrayList <Integer> number1 = new ArrayList<>();
        ArrayList <Integer> number2 = new ArrayList<>();
        ArrayList <Integer> number3 = new ArrayList<>();
        
        
        number1.add(10);
        number1.add(20);
        number1.add(30);
        number1.add(40);
        
        System.out.println("Number 1 : "+number1);
        
        
        number2.add(50);
        number2.add(60);
        number2.add(70);
        number2.add(80);
        
        System.out.println("Number 2 : "+number2);
        number3.addAll(number1);
        System.out.println("Number 3 : "+number3);
        boolean check = number1.equals(number3);
        System.out.println("Equality between number 1 & 3 : "+check);
        boolean check2 = number1.equals(number2);
        System.out.println("Equality between number 1 & 3 : "+check2);
        
    }
    
}
