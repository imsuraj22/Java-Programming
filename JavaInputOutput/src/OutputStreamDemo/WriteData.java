/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OutputStreamDemo;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class WriteData
{
    public static void main(String[] args)
    {
        try
        {
            String data="This is my first demo...!!!";
            FileOutputStream fos = new FileOutputStream("D:\\Test\\abc.txt");
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
