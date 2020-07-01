/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

/**
 *
 * @author tuhin
 */
public class typ_cst {
    public static void main(String[] args) {
        int x =10; 
        System.out.println("x = "+x);
    double y =x;
        System.out.println("x="+y);
        
      int z = (int)y;
        System.out.println("x="+z);
    
    }
}

/*
 what is type casting ?
    
    converting one data type to another is called type casting 
    primitive data type casting 
        implicit type casting/widining
            byte->short->int->int->long->float->double
        explicit type casting/narrowing
            double->float->long->int->short->byte
            
    NON PRIMITIVE DATA /OBJECT TYPE CASTING
UPCASTING : initiate sub clas object in super class
DOWNCASTING : initiate super class in subclass this is not allowed
    
*/
