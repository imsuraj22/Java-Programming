package eventdemo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class Test2 implements ActionListener, MouseListener
{
    JFrame jf;
    JTextField jt1, jt2;
    JRadioButton jr1, jr2;
    JComboBox jc;
    JButton jb1, jb2;
   
   
    
    void createFrame()
    {
        jf = new JFrame();
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
        
         jt1 = new JTextField();
        jt1.setBounds(250, 100, 250, 30);
        jf.add(jt1);
        
         jt2 = new JTextField();
        jt2.setBounds(250, 150, 250, 30);
        jf.add(jt2);
        
         jr1 = new JRadioButton("Male");
        jr1.setBounds(250, 190, 100, 30);
        jf.add(jr1);
        
          jr2 = new JRadioButton("Female");
        jr2.setBounds(350, 190, 100, 30);
        jf.add(jr2);
        
        ButtonGroup b1 = new ButtonGroup();
         b1.add(jr1);
         b1.add(jr2);
        
        ArrayList<String> name = new ArrayList<>();
        name.add("Maharashtra");
        name.add("delhi");
        name.add("punjab");
        name.add("uttar pradesh");
        name.add("gujrat");
        name.add("karnataka");
        name.add("tamilnadu");
        
        
         jc = new JComboBox(name.toArray());
         jc.setEditable(true);
        jc.setBounds(250, 240, 100, 30);
        jf.add(jc);
        
         jb1 = new JButton("Register");
        jb1.addActionListener(this);
        jb1.addMouseListener(this);
        jb1.setBounds(240, 350, 150, 50);
        jf.add(jb1);
        
          jb2 = new JButton("Cancel");
         jb2.addActionListener(this);
         jb2.addMouseListener(this);
        jb2.setBounds(459, 350, 150, 50);
        jf.add(jb2);
        
        jf.setVisible(true);
        
    }    

    @Override
    public void actionPerformed(ActionEvent e)
    {
        String gender;
     if(e.getSource()==jb1)
     {
         String name = jt1.getText();
         String email= jt2.getText();
         
         if(jr1.isSelected())
         {
             gender="male";
         }
        else
         {
             gender="Female";
         }
         if(name.equals("")|| email.equals(""))
         {
             JOptionPane.showMessageDialog(jf, "Fill complete details");
         }
         else
         {
             JOptionPane.showMessageDialog(jf,"Name: "+name+ "\n"+"Email: "+email+ "\n"+"Gender: "+gender+"\n"+"State: "+jc.getSelectedItem());
             
         }
        
     }
     if(e.getSource()==jb2)
     {
         jt1.setText(null);
         jt2.setText(null);
         
        
     }
     
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
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
public class RegisterEvents
{
    public static void main(String[] args) 
    {
       Test2 t2 = new Test2();
               t2.createFrame();
    }
}