/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author suraj
 */
public class MyClient
{
    public static void main(String[] args)
    {
        try
        {
            Socket socket = new Socket("192.168.43.15", 1111);
            
             OutputStream os =socket.getOutputStream();
             
             DataOutputStream dos = new DataOutputStream(os);
             
             String str ="Hello server";
             dos.writeUTF(str);
             
             dos.flush();
             
             dos.close();
             os.close();
             socket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
