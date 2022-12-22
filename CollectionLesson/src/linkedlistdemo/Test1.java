/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.LinkedList;

/**
 *
 * @author suraj
 */
public class Test1
{
    public static void main(String[] args)
    {
        LinkedList ll= new LinkedList();
        ll.add("avya");
        ll.add("sandya");
        ll.add("ayush");
        
        ll.addFirst("suraj");
        ll.addLast("suyog");
        
        System.out.println(ll);
    }
}
