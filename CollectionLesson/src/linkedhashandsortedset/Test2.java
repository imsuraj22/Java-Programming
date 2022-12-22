/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashandsortedset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author suraj
 */
public class Test2 
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add("aaa");
        al.add(100);
        
        HashSet hs = new HashSet(al);
        hs.add("aaa");
        hs.add(10);
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("eee");
        hs.add("fff");
        
        System.out.println(hs);
    }
}
