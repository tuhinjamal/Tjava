/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package date_and_time;

/**
 *
 * @author tuhin
 */
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class current_time {
    
    public static void main(String[] args) {
       LocalTime myObj = LocalTime.now();
    System.out.println(myObj);
        
    }
    
}
