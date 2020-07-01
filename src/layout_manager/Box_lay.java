/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tuhin
 */
public class Box_lay extends JFrame {

    private Container c;

    private BoxLayout bx;

    private JButton btn[];

    Box_lay() {

        initcomponent();

    }

    public void initcomponent() {

       c = this.getContentPane();
       

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JPANEL");
        this.setBounds(100, 100, 300, 600);
        bx = new BoxLayout(c,BoxLayout.Y_AXIS);
     
        c.setLayout(bx);

        //-------array button---------------------
        btn = new JButton[11];
        
        for (int i = 1; i <11; i++) {

            btn[i] = new JButton("" +i);
            c.add(btn[i]);
            c.add(Box.createHorizontalStrut(10));
           

        }
       
       

    }

    public static void main(String[] args) {

        Box_lay f = new Box_lay();
        f.setVisible(true);
        f.setResizable(false);
    }

}
