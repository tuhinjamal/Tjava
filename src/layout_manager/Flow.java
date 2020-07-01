/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

//import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tuhin
 */
public class Flow extends JFrame{
    
    
    
     private Container c;
  
     private FlowLayout fl;
    
    
    private JButton btn[],btn1;
    
    
    
    Flow(){
    
        initcomponent();
    
    }
     public void initcomponent(){
    
    c = this.getContentPane();
   
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("JPANEL");
    this.setBounds(100,100,150,200);
    fl = new FlowLayout(FlowLayout.CENTER/*,5,5*/);
    fl.setHgap(5);
    fl.setVgap(7);
    c.setLayout(fl);
    
    //-------array button---------------------
    btn = new JButton[9];
   
    
         for (int i = 0; i < 9; i++) {
             
             
             btn[i] = new JButton(""+(i+1));
             c.add(btn[i]);
             
         }
         btn1 = new JButton("0");
         c.add(btn1);
         
    
    
    
    
    
    
    
    
    }
    
    
    
    
    public static void main(String[] args) {
        
        Flow f = new Flow();
        f.setVisible(true);
        f.setResizable(false);
    }
    
}
