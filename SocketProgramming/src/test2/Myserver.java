/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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
            ServerSocket serversocket = new ServerSocket(2222);
            System.out.println("server iswaiting for client....");
            
            Socket socket =serversocket.accept();
            System.out.println("client found");
            System.out.println("----------------------------------------");
            
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str1="", str2="";
            
            while(!str1.equals("bye"))
            {
                str2=dis.readUTF();
                System.out.println("client says :"+str2);
                
                str1=br.readLine();
                dos.writeUTF(str1);
                dos.flush();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
