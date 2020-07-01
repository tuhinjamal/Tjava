/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student_management_system;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ABU JAFOR
 */
public class Stms extends JFrame implements ActionListener {

    private Container c;
    private JLabel fn, ln, pn, g;
    private JTextField f1, f2, f3, f4;
    private JButton ad, updt, dlt, clr;
    private JTextArea ta;
    private JTable tbl;
    private JScrollPane scrl;
    private DefaultTableModel model;
    private String[] cols = {"FIRST NAME", "LAST NAME", "PHONE NUMBER", "GPA"};
    private String[] rows = new String[4];

    Stms() {

        initcomponent();

    }

    public void initcomponent() {

        c = this.getContentPane();
        this.setBounds(100, 100, 700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setLayout(null);
        fn = new JLabel("First Name");
        fn.setBounds(50, 50, 100, 50);
        c.add(fn);

        f1 = new JTextField();
        f1.setBounds(150, 50, 100, 40);
        c.add(f1);

        ad = new JButton("ADD");
        ad.setBounds(280, 50, 100, 40);
        c.add(ad);

//        ta = new JTextArea();
//        ta.setBounds(40,250,600,190);
//        ta.setBackground(Color.GRAY);
//        c.add(ta);
        tbl = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(cols);
        tbl.setModel(model);
        tbl.setRowHeight(30);

        //tbl.setBounds(50,100,400,150);
        //tbl.setEnabled(false);
        tbl.setSelectionBackground(Color.yellow);
        tbl.setRowHeight(30);
        scrl = new JScrollPane(tbl);
        scrl.setBounds(40, 250, 600, 190);
        c.add(scrl);

        //--------------------------------------
        ln = new JLabel("Last Name");
        ln.setBounds(50, 100, 100, 50);
        c.add(ln);

        f2 = new JTextField();
        f2.setBounds(150, 100, 100, 40);
        c.add(f2);
        updt = new JButton("UPDATE");
        updt.setBounds(280, 100, 100, 40);
        c.add(updt);

        //--------------------------------------
        pn = new JLabel("Phone Number");
        pn.setBounds(50, 150, 100, 50);

        c.add(pn);

        f3 = new JTextField();
        f3.setBounds(150, 150, 100, 40);

        c.add(f3);

        dlt = new JButton("DELETE");
        dlt.setBounds(280, 150, 100, 40);
        c.add(dlt);

        //---------------------------------------
        g = new JLabel("GPA");
        g.setBounds(50, 200, 100, 50);
        c.add(g);

        f4 = new JTextField();
        f4.setBounds(150, 200, 100, 40);

        c.add(f4);

        clr = new JButton("CLEAR");
        clr.setBounds(280, 200, 100, 40);
        c.add(clr);

        ad.addActionListener(this);
        dlt.addActionListener(this);
        clr.addActionListener(this);
        updt.addActionListener(this);
        //----------------------------
        tbl.addMouseListener(new MouseAdapter ()
        {

            @Override
            public void mouseClicked(MouseEvent me){
            
                int nmbrofrow = tbl.getSelectedRow();
            
                String f_name = model.getValueAt(nmbrofrow,0).toString();
                String l_name = model.getValueAt(nmbrofrow,1).toString();
                String p_number = model.getValueAt(nmbrofrow,2).toString();
                String gp = model.getValueAt(nmbrofrow,3).toString();
                
                f1.setText(f_name);
                f2.setText(l_name);
                f3.setText(p_number);
                f4.setText(gp);
                
            } 
        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ad) {

            rows[0] = f1.getText();

            rows[1] = f2.getText();

            rows[2] = f3.getText();

            rows[3] = f4.getText();
            model.addRow(rows);



        } else if (e.getSource() == clr) {

            f1.setText("");
            f2.setText("");
            f3.setText("");
            f4.setText("");

        } else if (e.getSource() == dlt) {

            int nofrow = tbl.getSelectedRow();
            if (nofrow >= 0) {

                model.removeRow(nofrow);

            } else {

                JOptionPane.showMessageDialog(null, " you've selected nothing\n or \n no row exist ! ");

            }

        }else if (e.getSource() == updt) {
            
            int numebrofrow = tbl.getSelectedRow();
            
            String first_name = f1.getText();
            String  last_name = f2.getText();
            String phone_number =f3.getText();
            String g_pa = f4.getText();
            
            model.setValueAt(first_name,numebrofrow,0);
            model.setValueAt(last_name,numebrofrow,1);
            model.setValueAt(phone_number,numebrofrow,2);
            model.setValueAt(g_pa,numebrofrow,3);
            
            
            
        }
    }

    public static void main(String[] args) {
        Stms f = new Stms();
        f.setVisible(true);
    }

}
