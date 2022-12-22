/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characterstreamdemo;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author suraj
 */
public class BufferWriterDemo
{
    public static void main(String[] args) throws Exception
    {
        FileWriter fw=new FileWriter("D:\\Test\\xyz2.txt");
        
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("this is Suraj demo...!!");
        
        bw.close();
        fw.close();
    }
}
