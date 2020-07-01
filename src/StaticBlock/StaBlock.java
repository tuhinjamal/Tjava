
package StaticBlock;

/**
 *
 * @author tuhin
 */
public class StaBlock {
    static int id;
    static String name;
    
    static{
    
        id = 101;
        name = "Tuhin Jamal";
    
    }
   static void display(){
    
        System.out.println("ID :"+id);
        System.out.println("Name :"+name);
        
    }
    public static void main(String[] args) {
        StaBlock.display();
    }
}
