/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_2;

/**
 *
 * @author tuhin
 */
public class Teacher extends Person{
    
    private String qualification;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    
        
}
        void display(){
        System.out.println("name :"+getName());
        System.out.println("age :"+getAge());
        System.out.println("qualification:"+getQualification());
    
    
        }
    
    
}
