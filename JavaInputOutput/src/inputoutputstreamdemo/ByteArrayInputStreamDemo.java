/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamdemo;

import java.io.ByteArrayInputStream;

/**
 *
 * @author suraj
 */
public class ByteArrayInputStreamDemo 
{
     public static void main(String[] args)
    {
        String str="this is demo";
        byte[] b=str.getBytes();
        ByteArrayInputStream ba=new ByteArrayInputStream(b);
        int i;
        while( (i=ba.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
}
