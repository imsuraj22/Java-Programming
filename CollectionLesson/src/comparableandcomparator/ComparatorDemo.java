/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableandcomparator;

import java.util.TreeSet;
import java.util.Comparator;

/**
 *
 * @author suraj
 */
class Students
{
    int rollno;
    String name;

    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    @Override
    public String toString()
    {
        return rollno+"-"+name;
    }
   
}
class SortByName implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        Students ss = (Students)o1;
        Students sss = (Students)o2;
        int i= ss.name.compareTo(sss.name);
        return i;
    }
    
}
class SortByRollNo implements Comparator
{

    @Override
    public int compare(Object o1, Object o2)
    {
        Students ss = (Students)o1;
        Students sss = (Students)o2;
        Integer i1 = new Integer(ss.rollno);
        Integer i2 = new Integer(sss.rollno);
        int i=i1.compareTo(i2);
        return i;
    }
    
}
public class ComparatorDemo
{
    public static void main(String[] args)
    {
        Students s1 = new Students(1, "suraj");
        Students s2 = new Students(32, "avya");
        Students s3 = new Students(43, "sandya");
        Students s4 = new Students(35, "ayush");
        Students s5 = new Students(5, "omkar");
        
        System.out.println("according to the name :");
        TreeSet ts = new TreeSet(new SortByName());
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        System.out.println(ts);
        
        System.out.println("according to the rollno :");
        TreeSet ts1 = new TreeSet(new SortByRollNo());
        ts1.add(s1);
        ts1.add(s2);
        ts1.add(s3);
        ts1.add(s4);
        ts1.add(s5);
        System.out.println(ts1);
    }
}
