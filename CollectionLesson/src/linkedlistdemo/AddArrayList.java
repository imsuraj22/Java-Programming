/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistdemo;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author suraj
 */
public class AddArrayList
{
    
    public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        al.add("suraj");
        al.add("avya");
        al.add("sandya");
        al.add("ayush");
        al.add("suyog");
        
        LinkedList ll=new LinkedList(al);
        ll.addFirst("VIT");
        
        System.out.println(ll);
    }
}
