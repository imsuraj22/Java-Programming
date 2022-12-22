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
public class FolderCreation
{
    public static void main(String[] args)
    {
        File f = new File("D:\\Test\\fil1\\fil2\\fil3");
        
        if(f.mkdirs())
        {
            System.out.println("folder creation completed successfully");
        }
        else
        {
            System.out.println("folder creation failed due to some error");
        }
    }
}
