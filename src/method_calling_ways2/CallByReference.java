/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package method_calling_ways2;

/**
 *
 * @author tuhin
 */
public class CallByReference {

    String name;
    void change(CallByReference r2){
        r2.name = "Rubel";
    }
}

//
// in call by reference  a reference variable is a object of it's reference class and it stored in a heap memory because 
//heap memroy can store an object and in this case change in formal paramete affect to actual parameter 