/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistdemo;

import java.util.ArrayList;

/**
 *
 * @author suraj
 */
public class Test5
{
    public static void main(String[] args)
    {
        ArrayList al1 = new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        
        ArrayList al2 = new ArrayList();
        al2.add("suraj");
        al2.add("sandya");
        al2.add("avya");
        
        System.out.println(al1.removeAll(al2));
        System.out.println( al1.retainAll(al2));
        
        System.out.println(al1);
        System.out.println(al2);
    }
}
