/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author suraj
 */
public class Register {
    
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setSize(800, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
         JLabel jl1 = new JLabel("Register Here");
        jl1.setBounds(300, 5, 400, 100);
        jl1.setFont(new Font("Setif", Font.PLAIN,30));
        jf.add(jl1);
        
        JLabel jl2 = new JLabel("Name:");
        jl2.setBounds(100, 100, 100, 30);
        jl2.setFont(new Font("Setif", Font.PLAIN,20));
        jf.add(jl2);
        
        JLabel jl3 = new JLabel("Email:");
        jl3.setBounds(100, 100, 500, 120);
        jl3.setFont(new Font("Setif", Font.PLAIN,20));
        jf.add(jl3);
        
        JLabel jl4 = new JLabel("Gender:");
        jl4.setBounds(100, 100, 900, 210);
        jl4.setFont(new Font("Setif", Font.PLAIN,20));
        jf.add(jl4);
        
        JLabel jl5 = new JLabel("State:");
        jl5.setBounds(100, 100, 1300, 300);
        jl5.setFont(new Font("Setif", Font.PLAIN,20));
        jf.add(jl5);
        
        JTextField jt = new JTextField();
        jt.setBounds(250, 100, 100, 30);
        jf.add(jt);
        
        JTextField jt1 = new JTextField();
        jt1.setBounds(250, 150, 100, 30);
        jf.add(jt1);
        
        JRadioButton jr1 = new JRadioButton("Male");
        jr1.setBounds(250, 190, 100, 30);
        jf.add(jr1);
        
         JRadioButton jr2 = new JRadioButton("Female");
        jr2.setBounds(350, 190, 100, 30);
        jf.add(jr2);
        
        ArrayList<String> name = new ArrayList<String>();
        name.add("Maharashtra");
        name.add("delhi");
        name.add("punjab");
        name.add("uttar pradesh");
        name.add("gujrat");
        name.add("karnataka");
        name.add("tamilnadu");
        
        
        JComboBox jc = new JComboBox(name.toArray());
        jc.setBounds(250, 240, 100, 30);
        jf.add(jc);
        
        JButton jb1 = new JButton("Register");
        jb1.setBounds(240, 350, 100, 50);
        jf.add(jb1);
        
         JButton jb2 = new JButton("Cancel");
        jb2.setBounds(400, 350, 100, 50);
        jf.add(jb2);
        
        jf.setVisible(true);
                }
    
}

