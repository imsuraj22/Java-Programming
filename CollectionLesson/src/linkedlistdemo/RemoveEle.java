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
public class RemoveEle 
{
    public static void main(String[] args)
    {
        LinkedList ll=new LinkedList();
        
        ll.add("Suraj");
        ll.add("avya");
        ll.add("sandya");
        ll.add("ayush");
        ll.add("suyog");
        
        System.out.println(ll.removeFirst()+" element is removed");
        
        ll.removeLast();
        
        System.out.println(ll);
    }
}
