/*
        wrapper class are use to conver primitive data type into object and object into primitive data
        the difference between primitive and object type data is that first letter of a object must be in capital
        autoboxing : converting primitive to object
        unboxing   : converting object to primitive

*/

package wrapper_class;

/**
 *
 * @author tuhin
 */
public class wrp_cls_basic {
    public static void main(String[] args) {
        // primitive --> object 
        int x=30;
        Integer y = Integer.valueOf(x);
        System.out.println("y="+y);
        
        
        Integer z =x;   //Integer.valueOf(x);  //this is called autoboxing.
                System.out.println(""+z);
                
                
                //objectr --> primitive data type
                
                Double d = new Double(30.60);
                System.out.println("d = "+d);
                
                double e = d.doubleValue();
                System.out.println("e ="+e);
        
                
                double f = d; //.doubleValue(); // this is called unboxing.
                System.out.println("f ="+f);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    }
}
