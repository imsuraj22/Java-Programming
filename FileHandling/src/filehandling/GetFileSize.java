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
public class GetFileSize 
{
    public static void main(String[] args)
    {
        File f = new File("D:\\Test\\aaa.txt");
        
        long l = f.length();
        System.out.println(l);
        
        long ll = f.lastModified();
        System.out.println(ll);
        
        System.out.println(f.isFile());
    }
}
