/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class CharArrayWriterDemo
{
    public static void main(String[] args) throws IOException 
    {
        CharArrayWriter carw = new CharArrayWriter();
        carw.write("This is the demo of array writer...!!!!");
        
        FileWriter fw1 = new FileWriter("D:\\Test\\fw1.txt");
        FileWriter fw2 = new FileWriter("D:\\Test\\fw2.txt");
        FileWriter fw3 = new FileWriter("D:\\Test\\fw3.txt");
        
        carw.writeTo(fw1);
        carw.writeTo(fw2);
        carw.writeTo(fw3);
        
        fw1.close();
        fw2.close();
        fw3.close();
    }
    
}
