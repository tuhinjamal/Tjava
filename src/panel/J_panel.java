/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author tuhin
 */
public final class J_panel extends JFrame {
    private Container c;
    private JPanel p1,p2,p3,p4;
    private JButton b1,b2,b3,b4,b5;
    private BorderLayout by;
    
    
    J_panel(){
    
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
 
    
    
//    p1 = new JPanel();
//    p1.setBounds(0,0,300,300);
//    p1.setBackground(Color.RED);
//    c.add(p1);
//   // p1.add(b1);
//    p2 = new JPanel();
//    p2.setBounds(300,0,300,300);
//    p2.setBackground(Color.BLUE);
//    c.add(p2);
//    //p2.add(b2);
//    p3 = new JPanel();
//    p3.setBounds(0,300,300,300);
//    p3.setBackground(Color.yellow);
//    c.add(p3);
//   // p3.add(b3);
//    p4 = new JPanel();
//    p4.setBounds(300,300,300,300);
//    p4.setBackground(Color.GREEN);
//    c.add(p4);
    //p4.add(b4);
    
    
    
    }
    public static void main(String[] args) {
        J_panel f = new J_panel();
        f.setVisible(true);
    }
    
    
    
}
