/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketprogramming;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.DataInputStream;

/**
 *
 * @author suraj
 */
public class MyServer
{
     public static void main(String[] args)
    {
        try
        {
            ServerSocket serversocket=new ServerSocket(1111);
            System.out.println("Server is waiting for client");
            
            Socket socket=serversocket.accept();
            System.out.println("Client found");
            
            InputStream is=socket.getInputStream();
            
            DataInputStream dis=new DataInputStream(is);
            String str=dis.readUTF();
            
            System.out.println("Message from client : "+str);
            
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
