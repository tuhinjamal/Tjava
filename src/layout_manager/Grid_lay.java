/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layout_manager;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author tuhin
 */
public final class Grid_lay extends JFrame {

    private Container c;

    private GridLayout gr;

    private JButton btn[];

    Grid_lay() {

        initcomponent();

    }

    public void initcomponent() {

        c = this.getContentPane();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JPANEL");
        this.setBounds(100, 100, 300, 600);
        gr = new GridLayout(3, 3, 5, 5);
        c.setLayout(gr);

        btn = new JButton[11];

        for (int i = 0; i < 9; i++) {

            btn[i] = new JButton("" + (i + 1));
            c.add(btn[i]);

        }

    }

    public static void main(String[] args) {
        Grid_lay f = new Grid_lay();
        f.setVisible(true);
    }
}
