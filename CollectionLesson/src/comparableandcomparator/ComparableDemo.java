/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparableandcomparator;

import java.util.TreeSet;

/**
 *
 * @author suraj
 */
class Student implements Comparable
{
    int rollno;
    String name;

    public Student(int rollno, String name)
    {
        this.rollno=rollno;
        this.name=name;
    }

    @Override
    public int compareTo(Object o) 
    {
        Student st =(Student)o;
        return -this.name.compareTo(st.name);
    }
    
    @Override
    public String toString()
    {
        return rollno+"-"+name;
    }
}
public class ComparableDemo 
{
    public static void main(String[] args) 
    {
        Student s1= new Student(1, "Suraj");
        Student s2= new Student(2, "avya");
        Student s3= new Student(3, "sandya");
        Student s4= new Student(4, "suyog");
        Student s5= new Student(5, "ayush");
        Student s6= new Student(6, "omkar");
        
        TreeSet ts = new TreeSet();
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        ts.add(s6);
        
        System.out.println(ts);
    }
}
