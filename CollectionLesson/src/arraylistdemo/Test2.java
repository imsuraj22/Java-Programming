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
public class Test2 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        
        al.add(10);
        al.add(20);
        al.add(30);
        
        ArrayList al2 = new ArrayList();
        
        al2.add("suraj");
        al2.add("avya");
        
       // al.addAll(al2);
        al.addAll(2, al2);  // at specific index position
        
        System.out.println(al);
        System.out.println(al2);
    }
}
