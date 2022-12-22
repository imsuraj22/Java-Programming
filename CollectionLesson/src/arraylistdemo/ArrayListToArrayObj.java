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
public class ArrayListToArrayObj
{
    
    public static void main(String[] args)
    {
        ArrayList al1=new ArrayList();
        al1.add(10);
        al1.add(20);
        al1.add("Suraj");
        
        System.out.println("size of an array list : "+al1.size());
        
        Object[] obj=al1.toArray();
        for(int i=0; i<obj.length; i++)
        {
            System.out.println(obj[i]);
        }
    }
}
