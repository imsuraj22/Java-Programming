/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


/**
 * 
 *
 * @author suraj
 */

Class Test
{   int count = 0; 
    void A() throws Exception
    {        try     
  {
            count++;              
            try
            {
                count++;  
                try
                {
                    count++;
                    throw new Exception();
                 }                  
                catch(Exception ex)
                {
                    count++;
                    throw new Exception();
                }
            }             
            catch(Exception ex)
            {
                count++;
            }
        }
          
        catch(Exception ex)
        {
            count++;
        }  
    }  
    void display()
    {        System.out.println(count);
    }  
    public static void main(String[] args) throws Exception
    {
        Test obj = new Test();
        obj.A();
        obj.display();
    }
}