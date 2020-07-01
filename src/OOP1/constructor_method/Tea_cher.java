/*
 //constructor is a special type of method to initialize the object
properties of constructo :
it has same name as the name of it's class name
it has no return type
it is called autometically 
there are two types of constructor 
 1. default constructor(no parameter)
 2. parameterized constructor
here is another useful way is constructor overloading
*/
package OOP1.constructor_method;

/**
 *
 * @author tuhin
 */
public class Tea_cher {
     
    String name,gender;
    int phone;
    Tea_cher(){
        System.out.println("no value");
    }
   
   Tea_cher(String n, String g, int p){
   
       name = n;
       gender = g;
       phone = p;
   
   
   } 
   Tea_cher(String n, String g){
   
       name = n;
       gender = g;
   
   
   } 
   
    
    
    void displayInformation(){
        
        //method example
        System.out.println("----------*****----------");
        System.out.println("Name : "+name);
        System.out.println("Genger : "+gender);
        System.out.println("Phone : "+phone);
        
        
    }
    
}
/*

        difference between constractor and method 
          1.constructor             ||    1. Method used
            used to initialize      ||    to expose behaviour
            the state of an object  ||    of an object
          ------------------------------------------------------
            2. Must not have return ||    2. Must not have return 
                type                      type
            ----------------------------------------------------
            3. name is same as class||   any name can be given 
            ----------------------------------------------------
            4.invoked implicity     ||   invoked explicity
            
*/