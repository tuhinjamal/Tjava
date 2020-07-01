/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouse_lstn;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


/**
 *
 * @author tuhin
 */
public final class Mouse extends JFrame {
    
    private Container c;
    private JTextArea ta;
    private JTextField tf;
    private JScrollPane scroll;
    private Font f;
    private JButton btn;
    
    
    Mouse(){
    
    
        initcomponent();
    
    }
    
    
    public void initcomponent(){
        c = this.getContentPane();
        c.setLayout(null);
         tf = new JTextField();
        //ta.setBounds(100,150,300,300);
        tf.setFont(f);
        tf.setBackground(Color.yellow);
        
        scroll = new JScrollPane(tf, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(110, 20, 450, 100);
        c.add(scroll);
       tf.addMouseMotionListener(new MouseMotionListener(){
            @Override
            public void mouseDragged(MouseEvent me) {
               ta.setText("MOUSE DRAGGED "+me.getX()+"--"+me.getY()+"\n");
            }

            @Override
            public void mouseMoved(MouseEvent me) {
                ta.setText("MOUSE MOVED "+me.getX()+"--"+me.getY()+"\n");
            }
            
        
        });
        
        tf.addMouseListener(new MouseListener(){
            @Override
            public void mouseClicked(MouseEvent me) {
                ta.append("MOUSE CLICKED\n");
            }

            @Override
            public void mousePressed(MouseEvent me) {
                ta.append("MOUSE PRESSED\n");
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                ta.append("MOUSE RELASED\n");
            }

            @Override
            public void mouseEntered(MouseEvent me) {
                ta.append("MOUSE ENTERED\n");
            }

            @Override
            public void mouseExited(MouseEvent me) {
                ta.append("MOUSE EXITED\n");
            }
        });
       
        //c.add(ta);
        ta= new JTextArea();
        //lbl.setBounds(200,150,200,50);
        ta.setBackground(Color.BLACK);
        ta.setForeground(Color.yellow);
        //c.add(lbl);
        scroll = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(200,150,200,300);
        c.add(scroll);
        
        btn = new JButton(" FOCUS ");
        btn.setBounds(80,150,100,300);
        btn.setBackground(Color.BLACK);
        btn.setForeground(Color.yellow);
        c.add(btn);
        btn.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent fe) {
                ta.append("\nFOCUSED\n");
            }

            @Override
            public void focusLost(FocusEvent fe) {
                
                ta.append("\nFOCUS LOST\n");
            }
        });
        this.addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent we) {
               ta.setText("WINDOW OPEND");
            }

            @Override
            public void windowClosing(WindowEvent we) {
             
                System.out.println("WINDOW CLOSING");
            }

            @Override
            public void windowClosed(WindowEvent we) {

                JOptionPane.showMessageDialog(null, "WINDOW CLOSED");
            }

            @Override
            public void windowIconified(WindowEvent we) {
                System.out.println("WINDOW MINIMIZED");
                JOptionPane.showMessageDialog(null, "WINDOW MINIMIZED");
            }

            @Override
            public void windowDeiconified(WindowEvent we) {
                ta.setText("WINDOW DEMINIMIZED");
            }

            @Override
            public void windowActivated(WindowEvent we) {
                ta.setText("WINDOW ACTIVATED");
            }

            @Override
            public void windowDeactivated(WindowEvent we) {

                System.out.println("WINDOW DEACTIVATED");
            }
        });
        
        
        
        
        
    
    }
    
    
    
    
    
    public static void main(String[] args) {
        Mouse f = new Mouse();
         f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 600, 500);
        f.setTitle("MOUSE EVENT");
        
        
    }
    
   
    
}
