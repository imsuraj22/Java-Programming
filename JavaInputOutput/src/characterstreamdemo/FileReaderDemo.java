/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.FileReader;

/**
 *
 * @author suraj
 */
public class FileReaderDemo 
{
    public static void main(String[] args) throws Exception
    {
        FileReader fir = new FileReader("D:\\java programs\\ManyToManyAssociation.java");
        int i;
        while((i=fir.read()) != -1)
        {
            System.out.print((char)i);
        }
        fir.close();
        
    }
   
}
