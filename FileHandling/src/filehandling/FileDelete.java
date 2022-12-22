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
public class FileDelete
{
    public static void main(String[] args)
    {
        File f = new File("D:\\Test\\bbb.txt");
        
        if(f.delete())
        {
            System.out.println("file deleted successfully");
        }
        else
        {
            System.out.println("file deletion failed due to some error");
        }
    }
}
