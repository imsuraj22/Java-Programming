/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author suraj
 */
public class OutputStreamWriterDemo 
{
    public static void main(String[] args) throws Exception
    {
         String str1 = "This is my first demo...!!!";
         char[] str2 ={'a','b','c','d','e'};
       
        FileOutputStream fos = new FileOutputStream("D:\\Test\\abc2.txt");
       OutputStreamWriter osr = new OutputStreamWriter(fos);
       
       osr.write(str1);
       osr.close();
       
      
    }
}
