/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamdemo;

import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 *
 * @author suraj
 */
public class PipedInputStreamDemo
{
     public static void main(String[] args) throws Exception
    {
        String str="this is demo";
        
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();
        
        pis.connect(pos);
        
        pos.write(str.getBytes());
        
        int i;
        while( (i=pis.read()) != -1 )
        {
            System.out.print((char)i);
        }
    }
}
