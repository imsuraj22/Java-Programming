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
public class Test7 
{
     public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("Suraj");
        
        System.out.println(al1);
        System.out.println(al1.isEmpty());
        
        al1.clear();
        
        System.out.println(al1.isEmpty());
        System.out.println(al1);
    }
}
