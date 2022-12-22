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
public class FindDuplicateElements1
{
    public static void main(String[] args)
    {
        int[] a={12,5,35,64,24,12,54,24,5,67,8};
        int temp;
        
       for(int p=0; p<a.length; p++)
       {
            for(int i=0; i<a.length-1; i++)
        {
            if(a[i]>a[i+1])
            {
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
        }
       }
       //match the elements
            
            for(int i=0; i<a.length-1; i++)
            {
                if(a[i]==a[i+1])
                {
                    System.out.println(a[i]);
                }
            }
    }
}
