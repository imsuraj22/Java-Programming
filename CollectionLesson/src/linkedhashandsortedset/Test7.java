/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashandsortedset;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author suraj
 */
public class Test7
{
    public static void main(String[] args)
    {
        SortedSet ss=new TreeSet();

        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        ss.add("eee");
        
       
        System.out.println(ss.first());       //aaa
        System.out.println(ss.last());          //eee
        System.out.println(ss.headSet("ccc"));    //[aaa, bbb] - does not include itself
        System.out.println(ss.tailSet("ccc"));    //[ccc, ddd, eee] - include the provided object also
       System.out.println(ss.subSet("bbb", "eee"));    //[bbb, ccc, ddd] 2nd element doesn't include itself
        
        System.out.println(ss);
    }
}
