/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableandcomparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author suraj
 */
class MySorting implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        String s1 = o1.toString();
        String s2 = o2.toString();
        
        int leng1= s1.length();
        int leng2=s2.length();
        
        if(leng1>leng2)
        {
            return 1;
        }
        else if(leng1<leng2)
        {
            return -1;
        }
        else
        {
            return s1.compareTo(s2);
        }
    }
    
}
public class Task 
{
     public static void main(String[] args)
    {
        TreeSet ts=new TreeSet(new MySorting());
        ts.add("AAAA");
        ts.add("BB");
        ts.add("A");
        ts.add("BBB");
        ts.add("AA");
        ts.add("AAA");
        ts.add("B");
        System.out.println(ts);
    }
}
