/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface_demo;

/**
 *
 * @author tuhin
 */
public interface Animal {
   public void eat();
    
}

/*

    what is interface ? 
    interface is a collection of abstract method
    why do we need interface ?
    for fully abstraction
    it supports multiple inheritance
---------------------------------------------------
class extends class 
interface extends interface
------------------------------
x - class can't extends interface
class implements interface
--------------------------------------------------------------------
WHY INTERFACE SUPPORT MULTIPLE INHERITANCE WHERE CLASS DON'T ?
    public class A{                         public class B{
        void foo(){                             void foo(){                                         
        sout("i'm from A");                            sout("i'm from B");                                        
        }                                       }
    }                                       }
             public class D extends A,B{    ||          public class Test{
    
                void foo(){                 ||          psvm-->tab

                    sout("i'm from A");     ||          D ob = new D();
                                        
                    }                                   ob.foo(); // makes ambiguity error or diamond problem
            void foo(){                     ||

                    sout("i'm from A");     ||
                    
                    }
            }
            }
 but in the case of interface there only have interface name and signeture that helps to multiple inheritance .
*/
