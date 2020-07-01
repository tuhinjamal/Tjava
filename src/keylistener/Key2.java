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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author tuhin
 */
public class Key2 extends JFrame implements KeyListener {

    private Container c;
    private JTextField tf;
    private JTextArea ta;
    private Font f;
    private JLabel prompt, vl, al, el, il, ol, ul;
    private JScrollPane scroll;
    int total = 0;
    int a = 0, e = 0, i = 0, o = 0, u = 0;

    Key2() {

        initcomponent();

    }

    public void initcomponent() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.BLACK);
        f = new Font("Arial", Font.ITALIC, 25);

        prompt = new JLabel("Enter any text");
        prompt.setBounds(10, 20, 100, 30);
        prompt.setForeground(Color.yellow);
        c.add(prompt);
        vl = new JLabel("");
        vl.setBounds(100, 150, 150, 30);
        vl.setForeground(Color.yellow);
        c.add(vl);
        al = new JLabel("A");
        al.setBounds(100, 190, 150, 30);
        al.setForeground(Color.yellow);
        c.add(al);
        el = new JLabel("E");
        el.setBounds(100, 230, 150, 30);
        el.setForeground(Color.yellow);
        c.add(el);
        il = new JLabel("I");
        il.setBounds(100, 270, 150, 30);
        il.setForeground(Color.yellow);
        c.add(il);
        ol = new JLabel("O");
        ol.setBounds(100, 310, 150, 30);
        ol.setForeground(Color.yellow);
        c.add(ol);
        ul = new JLabel("U");
        ul.setBounds(100, 350, 150, 30);
        ul.setForeground(Color.yellow);
        c.add(ul);

        //---------------------------------------------------------------------------
        ta = new JTextArea();
        //ta.setBounds(100,150,300,300);
        ta.setFont(f);
        ta.setBackground(Color.yellow);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);
        ta.addKeyListener(this);
        //c.add(ta);

    }

    public static void main(String[] args) {
        Key2 f = new Key2();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 600, 500);
    }

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {

        if (ke.getSource() == ta) {

            if (KeyEvent.VK_A == ke.getKeyCode()) {

                a++;
                total++;

            }
            if (KeyEvent.VK_E == ke.getKeyCode()) {

                e++;
                total++;

            }
            if (KeyEvent.VK_I == ke.getKeyCode()) {

                i++;
                total++;

            }
            if (KeyEvent.VK_O == ke.getKeyCode()) {

                o++;
                total++;

            }
            if (KeyEvent.VK_U == ke.getKeyCode()) {

                u++;
                total++;
            }

        }

        vl.setText("TOTAL  VOWEL : " + total);
        al.setText("TOTAL  A : " + a);
        el.setText("TOTAL  E : " + e);
        il.setText("TOTAL  I : " + i);
        ol.setText("TOTAL  O : " + o);
        ul.setText("TOTAL  U : " + u);

    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }

}
