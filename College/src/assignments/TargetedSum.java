/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class TargetedSum 
{
    int target_sum=0;
    int result_arr[]= new int[0];
    int array[];
    public void findSum()
    {
       for(int i=0; i<array.length-1; i++)
       {
           for(int j=i+1; j<array.length; j++)
           {
               if(array[i]+array[j]==target_sum && array[i]!=array[j])
               {
                   result_arr = new int[]{array[i], array[j]};
               }
           }
       }
       System.out.println("Elements to get targeted sum are : "+Arrays.toString(result_arr));
    }
    public void getData(int size)
    {
        array= new int[size];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array elements");
        for(int i=0; i<array.length; i++)
        {
            array[i]=sc.nextInt();
        }
        
        System.out.println("Enter the targeted sum");
        target_sum=sc.nextInt();
        
    }
    public static void main(String[] args) 
    {
        TargetedSum ts= new TargetedSum();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int size=sc.nextInt();
        ts.getData(size);
        ts.findSum();
       
    }
}
