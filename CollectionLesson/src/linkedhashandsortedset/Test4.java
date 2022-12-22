/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashandsortedset;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author suraj
 */
public class Test4
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        System.out.println(al.get(0));
        
        HashSet hs = new HashSet();
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        
        //hs.clear();
        System.out.println(hs.contains("bbb"));
       // System.out.println(hs.remove("aaa"));
        System.out.println(hs.size());
        System.out.println(hs);
    }
}
