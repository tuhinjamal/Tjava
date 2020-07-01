/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exception_handling;

/**
 *
 * @author tuhin
 */
public class ExceptionDemo {
    
    public static void main(String[] args) {
     try{
     
         /*int x = 10;
        int y = 0;
        int result = x/y;
        System.out.println("Result :"+result);*/
         int [] a = new int [4];
            a [4] = 10;
            System.out.println("a[4]="+a[4]);
     
     }catch(ArrayIndexOutOfBoundsException e1){
             System.out.println("Exception 1 :"+e1);
    }catch(ArithmeticException e2){
            
            System.out.println("Exception 2 :"+e2);
    
    }catch(Exception e3){
            
         System.out.println("Exxception 3"+e3);
    
    }finally{
     
     System.out.println("Last line of the program");
     
     }
        
        
    }
    
}


/*

    what is exception ?
       -> exception is a run time error.
       TYPES OF EXCEPTION
ArithmeticExpression: can't devide a number by 0;
String name = Null;
sout(name.charAt(0))------------------->NullPointerException;
String name ="Anisul"// length 6
sout(name.charAt(9))----------------->StringIndexOutOfBounsException
int num= Integer.parseInt("ANIS");---------> NumberFormat Exception
File file = new File("D://file.txt");-----------> FileNotFoundException
int a[] = new int[5];
a[5] = 32;-------------------------------> ArrayIndexOutOfBounsException

        SOME OTHER EXCEPTION 
        ClassNotFoundException
        IOException
        NoSuchMethodException

what exception handling ?
    The exception handling is one of the most powerful mechanim to handle the runtime errors
    exception handling is managed by 5 keywords.
        
        1.try
        2.catch 
        3.finally
        4.throw
        5.throws

            try{
            
            //code you want to monitor

            }Catch(ExceptionType1 e1){

            //Exception handler for exception

            }Catch(ExceptionType2 e2){

            //Exception handler for exception

            }



            finally{
                //block of code to be executed after try block
            }


*/
