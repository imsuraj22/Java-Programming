/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo1.server;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author suraj
 */
public class AddImpClass extends UnicastRemoteObject implements AddInterface
{
    public AddImpClass() throws Exception
    {
        super();
    }

    @Override
    public int add(int no1, int no2) throws Exception 
    {
       return no1+no2;
    }
    
}
