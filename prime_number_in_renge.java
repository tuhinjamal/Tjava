

package basic;

import java.util.Scanner;

/**
 *
 * @author tuhin
 */
public class prime_number_in_renge {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter starting number");
        int m =input.nextInt();
        System.out.println("enter ending number");
        int n =input.nextInt();
        int i =0;
       int num =0;
       //Empty String
       String  primeNumbers = "";

       for (i = m; i <= n; i++)         
       { 		  	  
          int counter=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		counter = counter + 1;
	     }
	  }
	  if (counter ==2)
	  {
	     //Appended the Prime number to the String
	     primeNumbers = primeNumbers + i + " ";
	  }	
       }	
       System.out.println("Prime numbers from 1 to 100 are :");
       System.out.println(""+primeNumbers);
    }

}
    
    
    

