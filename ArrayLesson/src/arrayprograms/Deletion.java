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
public class Deletion 
{
     public static void main(String[] args)
    {
        int[] arr={10,50,30,80,90,70};
        
        int element=30;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==element)
            {
                for(int j=i; j<arr.length-1; j++)
                {
                    arr[j]=arr[j+1];
                }
                break;
            }
        }
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
