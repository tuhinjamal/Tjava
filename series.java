package basic;


import java.util.Scanner;



/**
 *
 * @author tuhin
 */
public class series {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter table no :");
        int n = input.nextInt();
        int sum=0;
        for (int i = 1; i <= 10; i++) {
            
            System.out.println(n+"X"+i+"="+n*i);
            sum=sum+i*i;
            
        }
        System.out.println("");
        //System.out.println(sum);
}
}
