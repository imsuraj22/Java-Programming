/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo1.server;

import java.rmi.Naming;

/**
 *
 * @author suraj
 */
public class Server
{
    public static void main(String[] args)
    {
        try
        {
           AddImpClass obj = new AddImpClass();
            Naming.rebind("rmi://192.168.43.15:1111/aaa", obj);
            
            System.out.println("server started");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
