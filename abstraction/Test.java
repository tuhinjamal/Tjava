/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author tuhin
 */
public class Test {
    public static void main(String[] args) {
        MobileUser mu;
        mu = new Rahim();
        mu.call();
        mu.sendmessage();
    
        mu = new Karim();
        mu.sendmessage();
        mu.call();
    }
}
/*
//    what is abstruction ?
        a process of hiding implementetion details and showing only 
        the functionality to the user 
-----------------------------------------------------------------
how to do abstaraction ?
there are two ways to do abstruction in java 
abstract class (0 to 100% abstruction as wish)
interface (100% abstruction)
------------------------------------------  
POINTS TO REMEMBER ABOUT ABSTRACT METHOD 
1. abstract method has no body 
2. must be ends with semicolon
3. must be in a abstract class
4. never can be final or static
5. abstract class can have abstract and non abstract method 
6. non abstract class can't have abstract method
7. abstract class can't instantiated that means can't be made it's object
8. if you extend an abstract class you have to use all it's abstract methods 
   or you have to declare the class abstract itself



*/