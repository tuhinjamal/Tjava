/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author tuhin
 */
public class arraylist_sort {
    
    
    public static void main(String[] args) {
           ArrayList <Integer> number1 = new ArrayList<>();
        
        
        number1.add(30);
        number1.add(50);
        number1.add(100);
        number1.add(90);
        
        System.out.println("Before sorting : "+number1);
        Collections.sort(number1);
        System.out.println("After sorting asscending : "+number1);
        Collections.sort(number1,Collections.reverseOrder());
       // Collections.reverse(number1);
        System.out.println("After  sorting descending : "+number1);
    }
    
}
