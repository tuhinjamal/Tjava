

package basic;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */


public class odd_even {

    public static void main(String[] args) {
       
        Scanner input= new Scanner(System.in);
            System.out.println("Enter initial number");
            int m = input.nextInt();
            System.out.println("Enter final number");
            int n = input.nextInt();

            
            int sum = 0;
            int sum2 = 0;
            int sum3 = 0;
            int sum4 = 0;
            int multiplication=1;
        for (int i = 0; i <= n; i++) {
            sum = sum+i;
        }
            System.out.println("sum of numbers in series :"+sum);
            
             for (int i = m; i <= n; i++) {
            sum2 = sum2+i;
            multiplication= multiplication*i;
            
             }
             
            System.out.println("sum of initial and final numbe is :"+sum2);
            System.out.println("multiplication result is :"+multiplication );
           
                    for (int i = 0; i <= n; i++) {
                        if (i%2!=0) {
                            
                            sum3 = sum3+i;
                            System.out.println("odd numbers in this renge"+i);             
                        }
        }
            System.out.println("sum of odd number between  this range is  :"+sum3);
               
             for (int i = 0; i <= n; i++) {
                        if (i%2==0) {
                            
                            sum4 = sum4+i;
                            System.out.println("even numbers in this renge"+i);             
                        }
        }
            System.out.println("sum of even number between  this range is  :"+sum4);
    
    
    
    }
    
    
}
