
package basic;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class table {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
       
        int i ,j;
       for (i = 1; i <=num; i++) {
            
            for (j = 1; j <=10; j++) {
               System.out.println(i+"X" +j+ "="+i*j);
           }
            
        }
     
    
    
    
    }



}
