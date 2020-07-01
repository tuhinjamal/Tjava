/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package this_keyword;

/**
 *
 * @author tuhin
 */
public class Person {
    
    String name;
    int age;
    String hair;
        Person(String name, int age){
        
        
            this.name=name;
            this.age=age;
            
            
        }
        
                Person(String name,int age,String hair){
        
        this(name,age);
            this.hair=hair;
            
        }
                
                void message(){
                
                    System.out.println("I'm message method");
                }
        
        
            void display(){
                this.message();// both function can work
                message();
                System.out.println("Name :"+name);
                System.out.println("Age :"+age);
                System.out.println("Hair Color :"+hair);
                System.out.println("\n");
            }
}
