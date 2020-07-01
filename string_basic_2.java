/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string;

import java.util.Locale;

/**
 *
 * @author tuhin
 */
public class string_basic_2 {
    public static void main(String[] args) {
         String first_name = "MARIA";
         String last_name = " IBRAHIM";
        String  full_name = first_name.concat(last_name);                     //first_name + last_name;
        System.out.println(""+full_name);
        String s2 = "TUHIN JAMAL";
        String s4 = "bangladesh";
        System.out.println(s2+" LOVES "+first_name);
        
       String cs = s4.toUpperCase();
        System.out.println(""+cs);
        
        String cs1 = s2.toLowerCase();
        System.out.println(""+cs1);
        boolean cs3 = s4.startsWith("b");
        System.out.println(""+cs3);
        cs3 =s4.endsWith("h");
        System.out.println(""+cs3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
