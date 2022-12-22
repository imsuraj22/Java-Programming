/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursordemo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author suraj
 */
public class IteratorDemo 
{
    public static void main(String[] args) 
    {
        ArrayList al = new ArrayList();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        
        Iterator itr =al.iterator();
        
        while(itr.hasNext())
        {
            
           // System.out.println(itr.next());
            int element= (int)itr.next();
           if(element==13)
           {
                itr.remove();
                System.out.println("Element removed successfully...........");
            }
            else
            {
                al.add(element);
           }
        System.out.println(al);
        }
        
    }
}
