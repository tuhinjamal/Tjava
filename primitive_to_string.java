/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wrapper_class;

/**
 *
 * @author tuhin
 */
public class primitive_to_string {
    public static void main(String[] args) {
        
        // primitive --> String
        boolean i = true;
        String j = Boolean.toString(i);
        System.out.println("converted "+j);
    
        //String --> primitive
        String s = "32";
        int  k = Integer.parseInt(s);
        System.out.println("string "+k+" has been converted to integer");
    }
    
}
