/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatserver.test1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
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
            String str = "Hello server";
            dos.writeUTF(str);
            dos.flush();
            
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            
            String str2 = dis.readUTF();
            System.out.println("Message from server :"+str2);
            
            dos.close();
            socket.close();
            dis.close();
            is.close();
        }
        catch(Exception e)
        {
            
        }
    }
}
