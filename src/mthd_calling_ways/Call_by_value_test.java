/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mthd_calling_ways;

/**
 *
 * @author tuhin
 */
public class Call_by_value_test {
    public static void main(String[] args) {
        CallByValue s1 = new CallByValue();
            int x=20;
            System.out.println("x before call:"+x);
            s1.change(x);
            System.out.println("x after call:"+x);
    }
    
}
