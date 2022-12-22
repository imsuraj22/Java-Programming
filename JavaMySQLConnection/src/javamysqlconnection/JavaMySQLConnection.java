  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamysqlconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author suraj
 */
public class JavaMySQLConnection {
    
    Connection con;
    Connection connect()
    {
       
         try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
             con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shopping","root","MySQL@22");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         return con;
    }

   
    public static void main(String[] args)
    {
        JavaMySQLConnection jv= new JavaMySQLConnection();
            jv.putData();
           jv.getData();
           jv.delete();
    }
    void putData()
    {
        try 
        {
            String name="suraj";
            String email="suraj@gmail.com";
            String password="suraj@123";
            String gender="M";
            String city="pune";
                                    
            con=connect();
            PreparedStatement ps=con.prepareStatement("insert into register values(?,?,?,?,?)");
            
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setString(3, password);
            ps.setString(4, gender);
            ps.setString(5, city);
            
            
            int i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("data inserted successfully");
            }
            else
            {
                System.out.println("can not insert the data");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    void getData()
    {
        try 
        {

            con=connect();
            PreparedStatement ps=con.prepareStatement("select * from register"); 
            
            ResultSet rs= ps.executeQuery(); 
            while(rs.next())
            {
                String name1= rs.getString("name");
                String email1= rs.getString("email");
                String password1= rs.getString("password");
                String gender1= rs.getString("gender");
                String city1= rs.getString("city");
                
                System.out.println("Name:- "+name1);
                System.out.println("Email:- "+email1);
                System.out.println("Password:- "+password1);
                System.out.println("Gender:- "+gender1);
                System.out.println("City:- "+city1);
                System.out.println("--------------------------------");
                
            }
        } 
        
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
    void delete()
    {
        try 
        {
            int i;
            String email="suraj@gmail.com";
            
           con=connect();
           PreparedStatement ps=con.prepareStatement("delete from register where email=?");
            
            
            ps.setString(1, email);
            
            i=ps.executeUpdate();
            if(i>0)
            {
                System.out.println("value deleted successfully");
            }
            else
            {
                System.out.println("can not delete the values");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
