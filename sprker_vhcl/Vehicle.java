/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprker_vhcl;

/**
 *
 * @author tuhin
 */
public class Vehicle {
    String color;
    double weight;
    Vehicle(String c,double w){
    
        color = c;
        weight = w;
    }
        void attribute(){
         
            System.out.println("color :"+color);
            System.out.println("weight :"+weight);
        }
}
