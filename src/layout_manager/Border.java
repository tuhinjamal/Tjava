/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tuhin
 */
public final class Border extends JFrame {
    
    
     private Container c;
    private JPanel p1,p2,p3,p4;
    private JButton b1,b2,b3,b4,b5;
    private BorderLayout by;
    
    
    Border(){
    
        initcomponent();
    
    }
    
    public void initcomponent(){
    
    c = this.getContentPane();
    by = new BorderLayout(/*10,5*/);
    by.setHgap(10);
    by.setVgap(5);
    c.setLayout(by);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("JPANEL");
    this.setBounds(100,100,600,600);
    
    b1 = new JButton("BUTTON");
    c.add(b1,BorderLayout.EAST);
    b2 = new JButton("BUTTON");
    c.add(b2,BorderLayout.WEST);
    b3 = new JButton("BUTTON");
    c.add(b3,BorderLayout.NORTH);
    b4 = new JButton("BUTTON");
    c.add(b4,BorderLayout.SOUTH);
    b5 = new JButton("BUTTON");
    c.add(b5,BorderLayout.CENTER);

    
    
    
    }
    public static void main(String[] args) {
        Border f = new Border();
        f.setVisible(true);
    }
    
    
    
}

    

