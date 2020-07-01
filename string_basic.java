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
public class string_basic {
    public static void main(String[] args) {
        // there is three ways to create a string 1.string class 2. string buffer class 3.string builder class.
        // String is a sequence of a charecter
        
        
        
        char [] s = {'M','A','R','Y','A','M'};
        System.out.println(s);
        
        String s1 = "MARYAM";
        String s2 = new String("TUHIN JAMAL");
        String s3 = "MARYAM";
        String s4 = "tuhin jamal";
        System.out.println(s2+" LOVES "+s1);
        int len=s1.length();
        System.out.println("Length of s1 :"+len);
        if (s1.equals(s3)) {
            
            System.out.println("equals");
            
        }else{
            
            System.out.println("not equals");
        }
        if (s1.contains(s3)) {
            System.out.println("contains");
        }
        if (s2.equalsIgnoreCase(s4)) {
            System.out.println("equals by ignoring case ");
        }
        boolean con =s1.contains("MARYAM");
        System.out.println(""+con);
        
        String s5 ="";
        boolean check = s5.isEmpty();
        System.out.println(""+check);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
