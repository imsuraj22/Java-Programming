/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedhashandsortedset;

import java.util.HashSet;

/**
 *
 * @author suraj
 */
public class Test3
{
    public static void main(String[] args)
    {
        HashSet hs = new HashSet(5, .80f);
        
        hs.add("aaa");
        hs.add("bbb");
        hs.add("ccc");
        hs.add("ddd");
        hs.add("eee");
        hs.add("fff");
        hs.add("ggg");
        
        System.out.println(hs);
    }
}
