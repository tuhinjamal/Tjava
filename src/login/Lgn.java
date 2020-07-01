/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import button.Pop;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tuhin
 */
public class Lgn extends JFrame {

    private ImageIcon icon, icon2;
    private Container cn;
    private JLabel label1, label2, label3,label4;
    private JTextField tf1;
    private JTextArea txt;
    private JScrollPane  scroll,scroll2;
    private Font f;
    private JPasswordField pf1, pf2;
    private JButton btn1, btn2, btn3;
    private Cursor cur, sor;

    Lgn() {

        initcomponent();

    }

    public void initcomponent() {
        icon = new ImageIcon(getClass().getResource("bismillah.png"));
        icon2 = new ImageIcon(getClass().getResource("reset1.png"));

        this.setIconImage(icon.getImage());

        cn = this.getContentPane();
        cn.setLayout(null);//to remove frame border layout indentetion
        cn.setBackground(Color.LIGHT_GRAY);
        //----------------------------------
        f = new Font("Arial", Font.BOLD + Font.ITALIC, 10);
        cur = new Cursor(Cursor.HAND_CURSOR);
        sor = new Cursor(Cursor.WAIT_CURSOR);
        // ------------------------JLabel---------------------------------------
        //--------------------------L1-------------------------------------------
        label1 = new JLabel();
        label1.setText("Enter your Username :");
        label1.setBounds(50, 20, 160, 20);
        label1.setToolTipText("Enter username");
        cn.add(label1);
        //---------------------------L2-----------------------------------------
        label2 = new JLabel();
        label2.setText("Enter your Password :");
        label2.setBounds(50, 60, 160, 20);
        label1.setToolTipText("Enter Password");
        cn.add(label2);
        // ---------all---------------JLabel-------------------------ends here
        // ------------------------JTextField-------------------------
        tf1 = new JTextField("name");
        tf1.setBounds(220, 20, 160, 20);
        tf1.setFont(f);
        tf1.setOpaque(true);
        tf1.setBackground(Color.DARK_GRAY);
        tf1.setForeground(Color.cyan);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        cn.add(tf1);
        // ------------------------JTextField----------eds here---------------
        //--------------------------JPasswordFiedl------------------------------
        pf1 = new JPasswordField();
        pf1.setEchoChar('/');
        pf1.setText("******");
        pf1.setBounds(220, 60, 160, 20);
        pf1.setFont(f);
        pf1.setOpaque(true);
        pf1.setBackground(Color.DARK_GRAY);
        pf1.setForeground(Color.cyan);
        pf1.setHorizontalAlignment(JTextField.CENTER);
        cn.add(pf1);
        //---------------------JPasswordField----------ends-------here----------
        //------------------------JTextArea-------------------------------------
        txt = new JTextArea("type here");
        txt.setBounds(220,82,160,40);
        txt.setFont(f);
        txt.setOpaque(true);
        txt.setBackground(Color.DARK_GRAY);
        txt.setForeground(Color.cyan);
        //text wrapper
        txt.setLineWrap(true);
        //word wrapper
        txt.setWrapStyleWord(true);
        //cn.add(txt);//no need because we added scroller by JScrollPane
        //------------------JScrollPane-----------------------------------------
        
        scroll = new JScrollPane(txt,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(220,82,160,40);
        cn.add(scroll);
        
        //------------------JScrollPane-----------------------------------ends--
        
        
        
        
        //------------------------JTextArea-----------------------ends----------
        
        
        //----------------------------B1----------------------------------------
        btn1 = new JButton("SUBMIT");
        btn1.setBounds(220, 125, 75, 20);
        btn1.setFont(f);
        btn1.setOpaque(true);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setForeground(Color.cyan);
        btn1.setHorizontalAlignment(JTextField.CENTER);
        btn1.setCursor(cur);
        cn.add(btn1);
        //----------------------BB2---------------------------------------------
        btn2 = new JButton("CLEAR");
        btn2.setBounds(300, 125, 80, 20);
        btn2.setFont(f);
        btn2.setOpaque(true);
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.cyan);
        btn2.setHorizontalAlignment(JTextField.CENTER);
        btn2.setCursor(sor);
        cn.add(btn2);
        //-------------------------BBB3-----------------------------------------
        btn3 = new JButton(icon2);                     //icon source given above 
        btn3.setBounds(220, 150, 160, 20);
        btn3.setFont(f);
        btn3.setOpaque(true);
        //btn3.setBackground(Color.DARK_GRAY);
        // btn3.setForeground(Color.cyan);
        btn3.setHorizontalAlignment(JTextField.CENTER);
        btn3.setCursor(cur);
        cn.add(btn3);
        //-----------------------JButton ends here------------------------------
        //-----------------------ActionListeners--------------------------------

        //--------------------------BTN 1 ActionListeners-----------------------
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = tf1.getText();
                String password = pf1.getText();
                String text     = txt.getText();
                System.out.println(text);
                if (username.equals("tuhin") && password.equals("jamal")) {
                    JOptionPane.showMessageDialog(null, "welcome " + username);
                   
                    
                   // dispose();
                    Popup frame = new Popup();
                    frame.setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(null, "#Tawba#STAY HOME#STAY SAFE");

                }
            }

        });
        //--------------------------BTN 1 ActionListeners-----------------------
       //--------------------------BTN BTN BTN 3 ActionListeners--------------
       
//--------------------------BTN BTN BTN 3 ActionListeners--------ends----
        

         btn2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                pf1.setText("");

            }

        });
//--------------------------BTN BTN BTN 3 ActionListeners--------------
        btn3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                pf1.setText("");

            }

        });

        // -------------------ActionListeners Ends Here------------------------
    }

    public static void main(String[] args) {

        Lgn f = new Lgn();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50, 500, 400);
        f.setTitle("Q&H API");
        f.setResizable(false);
        

    }

}
