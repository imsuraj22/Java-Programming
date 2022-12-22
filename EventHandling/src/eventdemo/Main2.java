package eventdemo;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
class Test1 implements ActionListener,MouseListener
{    
    JFrame jf;
    JTextField jt;
    JButton jb1, jb2;
    
    void createFrame()
    {
        jf = new JFrame();
        jf.setSize(600, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        
        jt = new JTextField();
        jt.setBounds(100, 50, 300, 50);
        jf.add(jt);
        
        jb1 = new JButton("Click Me");
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jb1.setBounds(90, 150, 200, 50);
        jf.add(jb1);
        
        jb2 = new JButton("Clear");
        jb2.addActionListener(this);
        jb2.addMouseListener(this);
        jb2.setBounds(350, 150, 200, 50);
        jf.add(jb2);
       
        jf.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()== jb1)
        {
            String name=jt.getText();
            if(name.equals(""))
            {
                JOptionPane.showMessageDialog(jf, "Name cannot be empty");
            }
            else
            {
                JOptionPane.showMessageDialog(jf,"Hello: " +name);
            }
                
        }
        if(e.getSource()== jb2)
        {
            jt.setText(null);
        }
      
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
        
    }

    @Override
    public void mousePressed(MouseEvent e)
    {
    }

    @Override
    public void mouseReleased(MouseEvent e)
    {
    }

    @Override
    public void mouseEntered(MouseEvent e)
    {
        if(e.getSource()==jb1)
        {
            jb1.setBackground(Color.green);
            jb1.setForeground(Color.black);
        }
        
         if(e.getSource()==jb2)
        {
            jb2.setBackground(Color.red);
            jb2.setForeground(Color.black);
        }
      
        
    }

    @Override
    public void mouseExited(MouseEvent e)
    {
          if(e.getSource()==jb1)
        {
            jb1.setBackground(null);
            jb1.setForeground(Color.black);
        }
          
           if(e.getSource()==jb2)
        {
            jb2.setBackground(null);
            jb2.setForeground(Color.black);
        }
    }
}    
public class Main2
{
    public static void main(String[] args)
    {
        Test1 t = new Test1();
        t.createFrame();
    }
}
