/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package string.StringBuffer;

/**
 *
 * @author tuhin
 */
public class string_basic5_sb {
    public static void main(String[] args) {
        String s1 = "Tuhin Jam";
        StringBuffer sb = new StringBuffer(s1);
        //StringBuffer sb = new StringBuffer("Tuhin");
        System.out.println(sb);
        // stringbuffer can work without store it in another variable 
        sb.append("al\n");
        System.out.println(sb);
        sb.append("0"+1677634402);
        System.out.println(sb);
        sb.setLength(5);
        System.out.println("length setted :"+sb);
        sb.delete(5, 11);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
    
}
