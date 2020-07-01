/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instance_static_vrbl.count;

/**
 *
 * @author tuhin
 */
public class Stud_count {
    
    
    int count = 0;
    static int  calculation =0;
    Stud_count(){
        
        count++;
        calculation ++;
    }
    void totalStudent(){
    
        System.out.println("instance count :"+count);
        System.out.println("static count :"+calculation);
    }
    
}
