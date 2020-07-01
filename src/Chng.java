
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tuhin
 */
public final class Chng extends JFrame implements ChangeListener  {

    private JSlider r, g, b;
    private JPanel pnl;
    private Container c;
    private JTextField j1, j2, j3;
   // private JTextArea j1, j2, j3;
    private JLabel l1, l2, l3;

    Chng() {

        initcomponent();

    }

    public void initcomponent() {

        c = this.getContentPane();
        this.setBounds(100, 100, 600, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setBackground(Color.ORANGE);
        c.setLayout(null);
        //----------------------------------------------------------------------
        
        l1 = new JLabel("Red");
        l1.setBounds(10, 20, 40, 40);
        l1.setBackground(Color.black);
        l1.setForeground(Color.red);
        l1.setHorizontalAlignment(JTextField.CENTER);
        c.add(l1);

        r = new JSlider(0, 50, 0);
        r.setBounds(60, 20, 250, 40);
        r.setMinorTickSpacing(1);
        r.setMajorTickSpacing(5);
        r.setPaintTicks(true);
        r.setPaintLabels(true);
        r.setBackground(Color.black);
        
        
        c.add(r);
        
        j1 = new JTextField();
        j1.setBounds(477, 20, 100, 40);
        j1.setBackground(Color.red);
        j1.setForeground(Color.yellow);

        c.add(j1);
        

        //-------------------tf2
        l2 = new JLabel("Green");
        l2.setBounds(10, 85, 40, 40);
        l2.setBackground(Color.black);
        l2.setForeground(Color.green);
        l2.setHorizontalAlignment(JTextField.CENTER);
        c.add(l2);

        g = new JSlider(0, 50, 0);
        g.setBounds(60, 85, 250, 40);
        g.setMinorTickSpacing(1);
        g.setMajorTickSpacing(5);
        g.setPaintTicks(true);
        g.setPaintLabels(true);
        g.setBackground(Color.black);

        c.add(g);

        j2 = new JTextField();
        j2.setBounds(477, 85, 100, 40);
        j2.setBackground(Color.green);
        c.add(j2);

        //-------------------tf3
        l3 = new JLabel("Blue");
        l3.setBounds(10, 150, 40, 40);
        l3.setBackground(Color.black);
        l3.setForeground(Color.blue);
        l3.setHorizontalAlignment(JTextField.CENTER);
        c.add(l3);
        b = new JSlider(0, 50, 0);
        b.setBounds(60, 150, 250, 40);
        b.setMinorTickSpacing(1);
        b.setMajorTickSpacing(5);
        b.setPaintTicks(true);
        b.setPaintLabels(true);
        b.setBackground(Color.black);

        c.add(b);

        j3 = new JTextField();
        j3.setBounds(477, 150, 100, 40);
        j3.setBackground(Color.blue);
        j3.setForeground(Color.LIGHT_GRAY);
        c.add(j3);

        pnl = new JPanel();
        pnl.setBounds(320, 20, 150, 170);
        pnl.setBackground(Color.YELLOW);
        c.add(pnl);
        r.addChangeListener(this);
        g.addChangeListener(this);
        b.addChangeListener(this);
        
        
       
      

    }


  @Override
    public void stateChanged(ChangeEvent ce) {
        
        int v1 = r.getValue();
        int v2 =g.getValue();
        int v3 = b.getValue();
        j1.setText(""+v1);
        j2.setText(""+v2);
        j3.setText(""+v3);
        
        Color color = new Color(v1,v2,v3);
        pnl.setBackground(color);
        
    }
    
      
    
    public static void main(String[] args) {

        Chng f = new Chng();
        f.setVisible(true);

    }



}

    

    

    

    

    


