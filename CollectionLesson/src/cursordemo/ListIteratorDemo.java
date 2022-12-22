/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursordemo;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author suraj
 */
public class ListIteratorDemo
{
     public static void main(String[] args)
    {
        ArrayList al=new ArrayList();
        
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        
        //----------forward direction-----------------------------------------
        ListIterator li=al.listIterator();
        while(li.hasNext())
        {
            System.out.println(li.next());
        }
        
        System.out.println("-------------------------------------");
        
        //-------------backword direction------------------------------------
        while(li.hasPrevious())
        {
            System.out.println(li.previous());
        }
        
       
    }
}

