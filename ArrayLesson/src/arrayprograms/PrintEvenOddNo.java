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
public class PrintEvenOddNo
{
    public static void main(String[] args)
    {
        int[] a ={2,4,6,3,7,4,7,4,3};
        
        int even_count=0, odd_count=0;
        
        for(int i=0; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                even_count=even_count+1;
            }
            else
            {
                odd_count=odd_count+1;
            }
        }
        
        int[] even_arr =new int[even_count];
        int[] odd_arr = new int[odd_count];
        
        int even_index_pos=0, odd_index_pos=0;
        
        for(int i=0 ; i<a.length; i++)
        {
            if(a[i]%2==0)
            {
                even_arr[even_index_pos]=a[i];
                even_index_pos=even_index_pos+1;
            }
            else
            {
                odd_arr[odd_index_pos]=a[i];
                odd_index_pos=odd_index_pos+1; 
            }
        }
        
        System.out.println("Even no's are :");
       for(int i=0; i<even_arr.length; i++)
       {
            System.out.print(even_arr[i]+" ");
       }
        System.out.println("\n");
        
        System.out.println("Odd no's are :");
       for(int i=0; i<odd_arr.length; i++)
       {
            System.out.print(odd_arr[i]+" ");
       }
       
    }
}
