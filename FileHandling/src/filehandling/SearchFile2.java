/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author suraj
 */
class MyFilter implements FilenameFilter
{
    String n;
    MyFilter(String n)
    {
        this.n=n;
    }
    public boolean accept(File dir, String name)
    {
        //return name.startsWith(n);
        return name.endsWith(n);
    }
}
public class SearchFile2
{
    public static void main(String[] args)
    {
        File f=new File("D:\\java programs\\");
        
        MyFilter mf=new MyFilter("java");
        
        String[] str=f.list(mf);
        
        for(int i=0; i<str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}
