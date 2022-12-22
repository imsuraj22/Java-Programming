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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author suraj
 */
public class Myserver
{
    public static void main(String[] args)
    {
        try
        {
            ServerSocket serversocket = new ServerSocket(1111);
            System.out.println("server is waiting for client...!!!");
            
             Socket socket =serversocket.accept();
             System.out.println("Client found.....");
             
             InputStream is = socket.getInputStream();
             
             DataInputStream dis = new DataInputStream(is);
             String str= dis.readUTF();
             System.out.println("Message from client :"+str);
             
             String str2 = "Hello client";
             OutputStream os = socket.getOutputStream();
             
             DataOutputStream dos = new DataOutputStream(os);
             dos.writeUTF(str2);
             
             dos.flush();
             
             dos.close();
             dis.close();
             is.close();
             socket.close();
             serversocket.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}
