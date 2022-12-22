/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author suraj
 */
public class DiffrentWaysToPrintArray
{
     public static void main(String[] args)
    {
        int[] a={10,20,30,40};
        
        //way 1
        for(int i=0; i<a.length; i++)
        {
            System.out.println(a[i]);
        }
        
        //iterate the elements in backword direction
        for(int i=a.length-1; i>=0; i--)
        {
            System.out.println(a[i]);
        }
        
        System.out.println("------------------------------------");
        
        //way 2 (while loop)
        int j=0;
        while(j<a.length)
        {
            System.out.println(a[j]);
            j++;
        }
        
        System.out.println("=====================================");
        //way 3 (for each loop)
        
        for(int v:a)
        {
            System.out.println(v);
        }
        
        System.out.println("===========================================");
        
        String[] str={"suraj","avya", "shubhya"};
        for(String s:str)
        {
            System.out.println(s);
        }
    }
}
