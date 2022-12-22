/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class BufferReaderDemo   
{
    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        FileReader fir = new FileReader("D:\\java programs\\ManyToManyAssociation.java");
        BufferedReader bf = new BufferedReader(fir);
        int i;
        while((i=bf.read()) != -1)
        {
            System.out.print((char)i);
        }
        bf.close();
        fir.close();
    }
}
