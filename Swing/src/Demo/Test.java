/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author suraj
 */
public class Test {
    
    public static void main(String[] args)
    {
       JFrame jf = new JFrame();
       jf.setSize(600, 400);
       jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       jf.setLayout(null);
       
       JLabel jl= new JLabel("Enter Name: ");
       jl.setBounds(100, 50, 100, 30);
       jf.add(jl);
       
        JTextField jt = new JTextField();
        jt.setBounds(200, 50, 250, 40);
        jf.add(jt);
        
        JButton jb = new JButton("Click Here");
        jb.setBounds(200, 150, 120, 40);
        jf.add(jb);
        
        jf.setVisible(true);
       
    }    
}
