/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action_listener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author tuhin
 */
public class Act_lstnr extends JFrame {
    
     private ImageIcon icon;
    private Container cn;
    private JTextField tf1, tf2;
    private JLabel label1,label2;
    private Font f;
    
    Act_lstnr(){
    
        initcomponent();
    
    }
    public void initcomponent(){
         icon = new ImageIcon(getClass().getResource("bismillah.png"));
         this.setIconImage(icon.getImage());
    
        cn = this.getContentPane();
        cn.setLayout(null);//to remove frame border layout indentetion
        cn.setBackground(Color.LIGHT_GRAY);
        //----------------------------------
        f = new Font("Arial",Font.BOLD+Font.ITALIC,14);
         label1 = new JLabel();
        label1.setText("Enter your Username :");
        label1.setBounds(50,20, 160, 20);
        cn.add(label1);
         label1.setToolTipText("Enter username");
        tf1 = new JTextField("name");
        tf1.setBounds(220,20, 160, 20);
        cn.add(tf1);
        tf1.setFont(f);
        tf1.setOpaque(true);
        tf1.setBackground(Color.DARK_GRAY);
        tf1.setForeground(Color.cyan);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        //*************************ACTION LISTENER *******************
        tf1.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e){
            
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "enter text");

                }else{
                
                     JOptionPane.showMessageDialog(null, "tf1 = "+s);

                }
            
            
            }
        
        
        });
                    //*************************ACTION LISTENER *******************

        //-----------------------------------
         label2 = new JLabel();
        label2.setText("Enter your password :");
        label2.setBounds(50,60, 160, 20);
        cn.add(label2);
        tf2 = new JTextField();
        tf2.setText("******");
        tf2.setBounds(220,60, 160, 20);
        cn.add(tf2);
        tf2.setFont(f);
        tf2.setOpaque(true);
        tf2.setBackground(Color.DARK_GRAY);
        tf2.setForeground(Color.cyan);
        tf2.setHorizontalAlignment(JTextField.CENTER);
            
        
            //*************************ACTION LISTENER *******************

         tf2.addActionListener(new ActionListener(){
        
     
            public void actionPerformed(ActionEvent e){
            
                String s = tf2.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "enter text");

                }else{
                
                     JOptionPane.showMessageDialog(null, "tf1 = "+s);

                }
            
            
            }
    
    });
         
         
       //*************************ACTION LISTENER *******************

    
    
   
    
    
    
}
     public static void main(String[] args) {
        
        Act_lstnr f = new Act_lstnr();
         
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50,500,400);
        f.setTitle("Q&H API");
    }
}
