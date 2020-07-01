/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.StringBuffer.string_blder;

/**
 *
 * @author tuhin
 */
public class string_builder_basic {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Tuhin\n");
        System.out.println("str = "+str);
        str.append("0"+1677634402);
        str.reverse();
       
        System.out.println(str);
        
         str.delete(0, 17);
         System.out.println("Data has been removed"+str);
    
    
    }
    
}
