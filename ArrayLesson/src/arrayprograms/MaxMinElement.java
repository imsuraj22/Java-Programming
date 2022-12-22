/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprograms;

/**
 *
 * @author suraj
 */
public class MaxMinElement 
{
    
    static void findMinElement(int[] a)
    {
        int min=a[0];
        for(int i=1; i<a.length; i++)
        {
            if(a[i] < min)
            {
                min=a[i];
            }
        }
        
        System.out.println("Minimum element is : "+min);
    }
    static void findMaxElement(int[] a)
    {
        int max=a[0];
        for(int i=1;i<a.length; i++)
        {
            if(a[i] > max)
            {
                max=a[i];
            }
        }
        System.out.println("Maximum element is : "+max);
    }
    public static void main(String[] args)
    {
        int[] a={30,70,10,20,60,50,90};
        MaxMinElement.findMinElement(a);
        MaxMinElement.findMaxElement(a);
    }
}


