/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadgroup;

/**
 *
 * @author suraj
 */
public class Test
{
    public static void main(String[] args)
    {
        String name = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Current thread group name :"+name);
        
        String parent_name = Thread.currentThread().getThreadGroup().getParent().getName();
        System.out.println("Parent thread group name :"+parent_name);
    }
}
