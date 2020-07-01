/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package button;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


/**
 *
 * @author tuhin
 */
public class Pop extends JFrame {
    private ImageIcon icon,icon2;
    private Container con;
    private JLabel label;

    Pop() {

        initcomponent();

    }

    public void initcomponent() {

        icon = new ImageIcon(getClass().getResource("fatiha.png"));
        icon2 = new ImageIcon(getClass().getResource("fatiha.png"));
        this.setIconImage(icon2.getImage());
        /*-------------------------container---------------------------------------*/
         con = this.getContentPane();
        con.setLayout(null);//to remove frame border layout indentetion
        con.setBackground(Color.LIGHT_GRAY);
        /*-------------------------container---------------------------------------*/
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(20, 10,450,450);
        con.add(label);
        
        
        
    }

    public static void main(String[] args) {
        Pop frame = new Pop();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400, 150, 500, 500);
        frame.setTitle("SURA FATIHA");
        frame.setResizable(false);
    }

}
