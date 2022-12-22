/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class RenameFile
{
    public static void main(String[] args) throws IOException
    {
        File f1=new File("D:\\Test\\aaa.txt");
        File f2=new File("D:\\Test\\abb.txt");
        
        if(f1.renameTo(f2))
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
    }
}
