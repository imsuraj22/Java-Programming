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
public class GetSpaceInfo
{
    public static void main(String[] args) 
    {
        File f = new File("E:\\");
        
        long l = f.getFreeSpace();
        System.out.println("Free space :"+l/(1024*1024*1024));
        
        long ll = f.getTotalSpace();
        System.out.println("Total space :"+ll/(1024*1024*1024));
    }
}
