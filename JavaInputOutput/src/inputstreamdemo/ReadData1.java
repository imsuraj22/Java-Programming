/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputstreamdemo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class ReadData1
{
     public static void main(String[] args)
    {
        FileInputStream fis=null;
        try
        {
              fis = new FileInputStream("D:\\java programs\\ManyToManyAssociation.java");
             int i;
             while((i=fis.read()) != -1)
             {
                 System.out.print((char)i); 
             }
             
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
               fis.close(); 
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
        }
       
    }
}
