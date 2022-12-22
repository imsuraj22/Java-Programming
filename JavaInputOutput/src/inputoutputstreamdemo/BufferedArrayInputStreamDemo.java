/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamdemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 *
 * @author suraj
 */
public class BufferedArrayInputStreamDemo 
{
     public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:\\Test\\abcd2.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        int i;
        while( (i=bis.read()) != -1 )
        {
            System.out.print((char)i);
        }
        fis.close();
        bis.close();
    }
}
