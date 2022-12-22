/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.FileWriter;

/**
 *
 * @author suraj
 */
public class FileWriterDemo 
{
    public static void main(String[] args) throws Exception
    {
        String data="This is my first demo...!!!!";
        
        FileWriter fiw = new FileWriter("D:\\Test\\xyz.txt");
        fiw.write(data);
        fiw.close();
        
        
    }
}
