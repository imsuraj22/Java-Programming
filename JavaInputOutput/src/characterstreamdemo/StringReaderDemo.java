/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.IOException;
import java.io.StringReader;

/**
 *
 * @author suraj
 */
public class StringReaderDemo 
{
    public static void main(String[] args) throws IOException
    {
        String data ="THis is my first demo...!!!";
        
        StringReader sr = new StringReader(data);
        int i;
        while((i=sr.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}
