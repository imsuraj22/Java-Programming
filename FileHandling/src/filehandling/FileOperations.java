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
public class FileOperations
{
    public static void main(String[] args) throws IOException
    {
        File f = new File("D:\\Test\\aaa.txt");
        
        if(f.createNewFile())
        {
            System.out.println("File created successfully");
        }
        else
        {
            System.out.println("file creation failed due to some error");
        }
    }
}
