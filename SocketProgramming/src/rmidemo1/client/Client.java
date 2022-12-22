/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo1.client;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author suraj
 */
public class Client
{
    public static void main(String[] args)
    {
        try
        {
            Registry registry= LocateRegistry.getRegistry("192.168.43.15", 1111);
            AddInterface ai= (AddInterface)Naming.lookup("aaa");
            System.out.println(ai.add(10,20));
        }
        catch(Exception e)
        {
            System.out.println(e);  
        }
    }
}
