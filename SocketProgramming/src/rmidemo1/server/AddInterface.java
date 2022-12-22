/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmidemo1.server;

import java.rmi.Remote;

/**
 *
 * @author suraj
 */
public interface AddInterface extends Remote
{
    public int add(int no1, int no2) throws Exception;
}
