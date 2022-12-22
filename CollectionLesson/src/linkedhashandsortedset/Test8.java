/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashandsortedset;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author suraj
 */
public class Test8 
{
    public static void main(String[] args)
    {
        NavigableSet ss=new TreeSet();

        ss.add("aaa");
        ss.add("bbb");
        ss.add("ddd");
        ss.add("eee");
        ss.add("fff");
        
        //System.out.println(ss.descendingSet());             //[eee, ddd, ccc, bbb, aaa]
       // System.out.println(ss.ceiling("ccc"));
        //System.out.println(ss.higher("ddd"));
        //System.out.println(ss.floor("bbb"));
        //System.out.println(ss.lower("bbb"));
       // System.out.println(ss.pollFirst());
        //System.out.println(ss.pollLast());
    }
}
