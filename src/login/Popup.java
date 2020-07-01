/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author tuhin
 */
public class Popup extends JFrame {

    private final ImageIcon icon;
    private final ImageIcon icon2;
    private final Container con;
    private final JLabel label;

    Popup() {

        icon = new ImageIcon(getClass().getResource("fatiha.png"));
        icon2 = new ImageIcon(getClass().getResource("fatiha.png"));
        this.setIconImage(icon2.getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(400, 150, 500, 500);
        this.setTitle("SURA FATIHA");
        this.setResizable(false);
        con = this.getContentPane();
        con.setLayout(null);//to remove frame border layout indentetion
        con.setBackground(Color.LIGHT_GRAY);
        /*-------------------------container---------------------------------------*/
        label = new JLabel();
        label.setIcon(icon);
        label.setBounds(20, 10, 450, 450);
        con.add(label);
        

    }

    public static void main(String[] args) {
        Popup frame = new Popup();
      
      
            
        
        
        
    }

}


