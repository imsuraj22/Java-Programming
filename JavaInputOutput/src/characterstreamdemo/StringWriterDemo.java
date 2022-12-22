/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.StringWriter;

/**
 *
 * @author suraj
 */
public class StringWriterDemo 
{
    public static void main(String[] args)
    {
        StringWriter sw = new StringWriter();
        sw.write("This is my first demo...!!!");
        
        System.out.println(sw);
    }
}
