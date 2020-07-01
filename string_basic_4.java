/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

/**
 *
 * @author tuhin
 */
public class string_basic_4 {
    public static void main(String[] args) {
        
        String s = " Thjs js my country";
        System.out.println(s);
        String s1 = s.replace('j', 'i');
        System.out.println(s1);
        
        String [] s3 = s1.split(" ");
        for(String i : s3){
        
            System.out.println(i);
        
        }
        
    }
}
