/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstruction_problem_solve;

/**
 *
 * @author tuhin
 */
public class Circle extends Shape {
      Circle(double r){
    
    super(r, r);
    }
    @Override
    void area(){
    double result =Math.PI *dim1*dim1;
        System.out.println("Area is "+result);
    
    }
}
