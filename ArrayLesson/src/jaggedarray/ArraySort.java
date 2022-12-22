/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaggedarray;

import java.util.Arrays;

/**
 *
 * @author suraj
 */
public class ArraySort 
{
     public static void main(String[] args)
    {
        int[] a={40,20,80,50,10,90};
        Arrays.sort(a);
        
        for(int i:a)
        {
            System.out.print(i+" ");
        }
    }
}
