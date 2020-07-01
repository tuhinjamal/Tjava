

package basic;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class factorial {
    
    public static void main(String[] args) {
        int num ;
        int fact = 1; 
        System.out.println("Enter any positive number");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i =  num; i >=1; i--) {
            
            fact= fact * i;
            
            
        }
        System.out.println("factorial of "+num+ " = "+fact);
        
    }
    
}
