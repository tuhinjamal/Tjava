/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aclisner_3rd_mthd;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tuhin
 */
public class Sample extends JFrame implements ActionListener {

    private JButton btn1,btn2,btn3;
    private JLabel lbl;
    private Container c;
   

    Sample() {

        initcomponent();
    }

    public void initcomponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        btn1 =new JButton("CLICK TO SEE MAGIC");
        btn1.setBackground(Color.GREEN);
        btn1.setBounds(150,100,200,80);
        c.add(btn1);
        
        btn1.addActionListener(this); 
        
        
        //----------------------------------------------------------------------
        btn2 =new JButton("CLICK TO SEE MAGIC");
        btn2.setBounds(150,200,200,80);
        btn2.setBackground(Color.RED);
        btn2.setBorderPainted(true);
        c.add(btn2);
      
        btn2.addActionListener(this);
        
        //----------------------------------------------------------------------
        btn3 =new JButton("CLICK TO SEE MAGIC");
        btn3.setBounds(150,300,200,80);
        btn3.setBackground(Color.GREEN);
        c.add(btn3);
         btn3.addActionListener(this);
    }

    public static void main(String[] args) {
        Sample f = new Sample();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50, 500, 500);

        f.setTitle("Q&H API");
        f.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn1) {
            
               btn3.setBackground(Color.blue);
               c.setBackground(Color.yellow);
                btn2.setBackground(Color.MAGENTA);
                btn1.setBackground(Color.RED);
            
        }else if(e.getSource() == btn2){
        
        
            btn3.setBackground(Color.RED);
                btn2.setBackground(Color.pink);
                btn1.setBackground(Color.yellow);
                 c.setBackground(Color.blue);
        }else{
        
        
            
                btn3.setBackground(Color.blue);
                btn2.setBackground(Color.WHITE);
                btn1.setBackground(Color.yellow);
                 c.setBackground(Color.magenta);
        }
    }
}
