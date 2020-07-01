 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keylistener;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tuhin
 */
public class Key extends JFrame implements KeyListener {

   private Container c ;
   private JTextField tf;
   private JTextArea ta;
   private Font f;
   private JScrollPane  scroll,scroll2;
    
   Key(){
    
       initcomponent();
   
   }
   
   public void initcomponent(){
   
   c = this.getContentPane();
   c.setLayout(null);
   c.setBackground(Color.BLACK);
   f = new Font("Arial",Font.ITALIC,25);
   tf = new JTextField();
   tf.setBounds(100,50,300,80);
   tf.setFont(f);
   c.add(tf);
   tf.addKeyListener(this);
   
   //---------------------------------------------------------------------------
   ta = new JTextArea();
   //ta.setBounds(100,150,300,300);
   ta.setFont(f);
   ta.setLineWrap(true);
   ta.setWrapStyleWord(true);
   scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(100,150,300,300);
        c.add(scroll);
  // c.add(ta);
   
   
   
   }
    
    public static void main(String[] args) {
        Key f = new Key();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(250,250,500,500);
    
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        ta.append("Key typed : "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        ta.append("Key pressed : "+ke.getKeyChar()+"\n");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        ta.append("Key relased :"+ke.getKeyChar()+"\n");
    }
    
}
