/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_interface_2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JToggleButton;

/**
 *
 * @author tuhin
 */
public final class Jtoggle extends JFrame implements ActionListener {

    private Container c;
    private JPanel p;
    private JToggleButton tb;
    private JLabel lbl;
    private ImageIcon icon,icon1;
    private JSlider js;
    

    Jtoggle() {
    
        initcomponent();
    
    }
    public void initcomponent(){
    
    
       icon = new ImageIcon(getClass().getResource("on.png"));
       icon1 = new ImageIcon(getClass().getResource("one.png"));
       
        
        c = this.getContentPane();
        this.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.BLACK);
        c.setLayout(null);
        
        p = new JPanel();
        p.setBounds(300,100,150,150);
        p.setBackground(Color.yellow);
        p.setVisible(false);
        c.add(p);
        
        
        tb = new JToggleButton(icon);
        tb.setBounds(100,100,150,150);
        tb.setBackground(Color.RED);
        c.add(tb);
        tb.addActionListener(this);
        
        lbl = new JLabel("WELCOME");
        lbl.setBounds(300,100,150,150);
        lbl.setBackground(Color.PINK);
        p.add(lbl);
        
        js = new JSlider(JSlider.VERTICAL,-10,10,0);
        js.setBounds(10,10,50,400);
        js.setMinorTickSpacing(1);
        js.setMajorTickSpacing(5);
        js.setPaintTicks(true);
        js.setPaintLabels(true);
        
        c.add(js);
        
    
    
    }

    

    public static void main(String[] args) {
        Jtoggle f = new Jtoggle();
        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        if (tb.isSelected()) {
            
            tb.setIcon(icon1);
            p.setVisible(true);
            
        }else{
        
            tb.setIcon(icon);
            p.setVisible(false);
            
            
            
        }
        
    }

}
