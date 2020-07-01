/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiple_inheritance;

/**
 *
 * @author tuhin
 */
public class Test {
    public static void main(String[] args) {
        C c = new C();
        c.play();
    }
}
/*
    dissimilarity between class and interface
    1.an interfacecan't be instantiate 
    2.interface doesn't contain constructor
    3.all method are abstract
    4.an interface can't have instance variable
    5.an interface can extends multiple interface

--------------------------------------------------------------------------------
        INTERFACE                   VS            ABSTRACT CLASS
    ONLY HAVE ABSTRACT METHOD       ||  CAN HAVE ABSTRACT NONE ABSTRACT BOTH 
    SUPPORT MULTIPLE INHERITENCE    ||  CAN'T SUPPORT 
    ONLY HAVE STATIC FINAL VARIABLE || HAVE ALL STATIC NON STATIC FINAL  
                                       NONE FINAL                         
    FULLY ABSTRACT                  || PARTIALLY ABSTRACTED


*/