/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vrbl_lnth_argmt;

/**
 *
 * @author tuhin
 */
public class Varags {
    
    void add(int ...num){
    int sum =0;
        for (int x : num) {
            sum =sum+x;
        }
        System.out.println("value of sum is :"+sum);
    
    }
    
}
