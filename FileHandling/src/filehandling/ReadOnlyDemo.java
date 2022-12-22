/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;

/**
 *
 * @author suraj
 */
public class ReadOnlyDemo 
{
    public static void main(String[] args) 
    {
        File f= new File("D:\\Test\\abcd.txt");
        
        if(f.setReadOnly())
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("failed");
        }
        
        System.out.println("file can be read :"+f.canRead());
        System.out.println("file can be write :"+f.canWrite());
   }
}
