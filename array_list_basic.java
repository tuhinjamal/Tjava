/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package array_list;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tuhin
 */
public class array_list_basic {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        System.out.println("Size :"+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(3, 40);
        //Iterator method 
      /*  Iterator  itr =  number.iterator();
            while(itr.hasNext()){
                
                System.out.println(""+itr.next());
            
            }*/
        //System.out.println(number);
        //foreach loop 
        for (int x : number) {
            
            System.out.print("\t"+x);
            
        }
        int pos = number.indexOf(30);
        boolean search =number.contains(30);
        System.out.println("\nelement existence :"+search+"\nsituated at : location "+pos);
        number.set(2, 25);
        System.out.println("\n An element has repeleced"+number);
        int x = number.get(2);
                System.out.println("\nnow new element at that location :"+x);    
       boolean check = number.isEmpty();
        System.out.println("\ncondition"+check);
       // remove method
        number.remove(0);
        System.out.println("\nafter remove :"+number);
        
        number.removeAll(number);
        System.out.println("\nafter remove :"+number);
        
        System.out.println("\nSize :"+number.size());
      
        
        /*  number.clear();
        System.out.println("\nafter remove :"+number);
        
        System.out.println("\nSize :"+number.size());*/
         boolean cross_check = number.isEmpty();
        System.out.println("\ncondition :"+cross_check);
    }
    
}
