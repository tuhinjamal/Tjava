/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

import java.awt.CardLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tuhin
 */
public final class Card_lay extends JFrame implements ActionListener {
    
    
    
       private Container c;

    private CardLayout cr;

    private JButton btn[];

    Card_lay() {

        initcomponent();

    }

    public void initcomponent() {

        c = this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JPANEL");
        this.setBounds(100, 100, 300, 600);
        cr = new CardLayout(10,10);
        c.setLayout(cr);

        btn = new JButton[11];
        
        

        for (int i = 0; i < 9; i++) {

            btn[i] = new JButton("" + (i + 1));
            c.add(btn[i],"this is button no :"+i);
            btn[i].addActionListener(this);

        }

        
        
    }
    
    
    public static void main(String[] args) {
        Card_lay f = new Card_lay();
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
      cr.next(c);
//         cr.previous(c);
//         cr.show(c,"this is button no :");
  //         cr.first(c);
    }
    
}
