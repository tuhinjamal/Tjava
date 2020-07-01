/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package date_and_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author tuhin
 */
public class current_date {
    public static void main(String[] args) {
              Date date = new Date();
      //  System.out.println(date);
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        String currentdate = format.format(date);
        System.out.println("Current Date :"+currentdate);
     
    }
}
