/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

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
import javax.swing.JTextField;
import password_field.Pswd;

/**
 *
 * @author tuhin
 */
public class Button_dm extends JFrame {

    private ImageIcon icon, icon2;
    private Container cn;
    private JTextField tf1;
    private JLabel label1, label2, label3;
    private Font f;
    private JPasswordField pf1, pf2;
    private JButton btn1, btn2, btn3;
    private Cursor cur, sor;

    Button_dm() {

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

        //-----------------------------------------
        label1 = new JLabel();
        label1.setText("Enter your Username :");
        label1.setBounds(50, 20, 160, 20);
        cn.add(label1);
        label1.setToolTipText("Enter username");
        tf1 = new JTextField("name");
        tf1.setBounds(220, 20, 160, 20);
        cn.add(tf1);
        tf1.setFont(f);
        tf1.setOpaque(true);
        tf1.setBackground(Color.DARK_GRAY);
        tf1.setForeground(Color.cyan);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        //++++++++++++++++++++++++++++++++++++++++++++++++
        btn1 = new JButton("SUBMIT");
        btn1.setBounds(220, 125, 75, 20);
        cn.add(btn1);
        btn1.setFont(f);
        btn1.setOpaque(true);
        btn1.setBackground(Color.DARK_GRAY);
        btn1.setForeground(Color.cyan);
        btn1.setHorizontalAlignment(JTextField.CENTER);
        btn1.setCursor(cur);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                String username = tf1.getText();
                String password = pf1.getText();
                String confirm = pf2.getText();
                if (username.equals("tuhinjamal") && password.equals("tuhin") && confirm.equals("tuhin")) {
                    JOptionPane.showMessageDialog(null, "welcome " + username);
                    dispose();
                    Pop frame = new Pop();
                    frame.setVisible(true);
                } else {

                    JOptionPane.showMessageDialog(null, "#STAY HOME#STAY SAFE");

                }
            }

        });

        //-----------------------------------
        label2 = new JLabel();
        label2.setText("Enter your password :");
        label2.setBounds(50, 60, 160, 20);
        cn.add(label2);
        pf1 = new JPasswordField();
        pf1.setEchoChar('/');
        pf1.setText("******");
        pf1.setBounds(220, 60, 160, 20);
        cn.add(pf1);
        pf1.setFont(f);
        pf1.setOpaque(true);
        pf1.setBackground(Color.DARK_GRAY);
        pf1.setForeground(Color.cyan);
        pf1.setHorizontalAlignment(JTextField.CENTER);
        //##############################################
        label3 = new JLabel();
        label3.setText("Confirm password :");
        label3.setBounds(50, 100, 160, 20);
        cn.add(label3);
        pf2 = new JPasswordField();
        pf2.setEchoChar('/');
        pf2.setText("******");
        pf2.setBounds(220, 100, 160, 20);
        cn.add(pf2);
        pf2.setFont(f);
        pf2.setOpaque(true);
        pf2.setBackground(Color.DARK_GRAY);
        pf2.setForeground(Color.cyan);
        pf2.setHorizontalAlignment(JTextField.CENTER);

        //############################################
        btn2 = new JButton("CLEAR");
        btn2.setBounds(300, 125, 80, 20);
        cn.add(btn2);
        btn2.setFont(f);
        btn2.setOpaque(true);
        btn2.setBackground(Color.DARK_GRAY);
        btn2.setForeground(Color.cyan);
        btn2.setHorizontalAlignment(JTextField.CENTER);
        btn2.setCursor(sor);
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        btn3 = new JButton(icon2);
        btn3.setBounds(220, 150, 160, 20);
        cn.add(btn3);
        btn3.setFont(f);
        btn3.setOpaque(true);
        //btn3.setBackground(Color.DARK_GRAY);
        // btn3.setForeground(Color.cyan);
        btn3.setHorizontalAlignment(JTextField.CENTER);
        btn3.setCursor(cur);
        btn3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                tf1.setText("");
                pf1.setText("");
                pf2.setText("");

            }

        });

    }

    public static void main(String[] args) {

        Button_dm f = new Button_dm();

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 50, 500, 400);
        f.setTitle("Q&H API");
        f.setResizable(false);
    }

}
