/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;



/**
 *
 * @author suraj
 */
public class Submit implements ActionListener{
    
    static JTextField Id;
    static  JTextField name1;
    static JButton submit;
    

    
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Login");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel ID= new JLabel("ID");
        JLabel lname = new JLabel("Name");
        
        ID.setBounds(50, 50, 50, 50);
        lname.setBounds(20, 100, 80, 50);
        frame.add(ID);
	frame.add(lname);
        
        Id=new JTextField();
        name1=new JTextField();
        Id.setBounds(100,50,250,50);
	name1.setBounds(100,100,250,50);
	frame.add(Id);
	frame.add(name1);
        
        submit=new JButton("Submit");
	submit.setBounds(150,200,100,50);
	frame.add(submit);
        
        Submit obj=new Submit();
	submit.addActionListener(obj);
	frame.setVisible(true);
        
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String id= Id.getText();
        String name= name1.getText();
        System.out.println("ID = "+id+" Name = "+name);
    }
    
}
