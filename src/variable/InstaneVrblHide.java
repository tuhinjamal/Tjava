  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variable;

/**
 *
 * @author tuhin
 */
public class InstaneVrblHide {
    double height,width,depth;
    InstaneVrblHide(double height,double width, double depth){
        
        this.height = height;
        this.width = width;
        this.depth = depth;
       }
     void display(){
    
        double vol = height*width*depth;
        System.out.println("volume is : "+vol);
    
    }
    
}
