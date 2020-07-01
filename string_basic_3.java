/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tuhin
 */
public class string_basic_3 {
    public static void main(String[] args) {
        String country = "          Bangladesh is my country           ";
        System.out.println(country);
        char ch = country.charAt(0);
        System.out.println(ch);
        
        //get ascii value 
        int value = country.codePointAt(0);
        System.out.println(value);
        
        // find string index
        int pos = country.indexOf('a');
        System.out.println(pos);
        
        int pos1 = country.lastIndexOf('a');
        System.out.println(pos1);
        
    String s = country.trim();
        System.out.println(s);
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
