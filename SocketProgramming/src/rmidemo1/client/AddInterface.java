/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo1.client;

import java.rmi.RemoteException;



/**
 *
 * @author suraj
 */
public interface AddInterface
{
    public int add(int no1, int no2) throws RemoteException;   
}
