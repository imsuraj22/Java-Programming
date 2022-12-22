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
public class SearchFile1
{
    public static void main(String[] args)
    {
        File f=new File("D:\\Test\\");
        String[] str=f.list();
        for(int i=0; i<str.length; i++)
        {
            System.out.println(str[i]);
        }
    }
}

