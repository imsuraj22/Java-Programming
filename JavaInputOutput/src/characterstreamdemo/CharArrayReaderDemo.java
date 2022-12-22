/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class CharArrayReaderDemo
{
    public static void main(String[] args) throws IOException 
    {
        char[] ch = {'a', 'b','c','d'};
        CharArrayReader car = new CharArrayReader(ch);
        
        int i;
        while((i=car.read()) != -1)
        {
            System.out.print((char)i);
        }
        car.close();
    }
}
