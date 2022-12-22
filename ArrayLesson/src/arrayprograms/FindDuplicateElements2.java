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
public class FindDuplicateElements2
{
     public static void main(String[] args)
    {
        int[] arr={40,30,70,90,60,10,30,43,23,43,22,12,70};
        
        int count=0;
        
        System.out.println("Duplicate elements are :- ");
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    count=count+1;
                    System.out.println(count+". "+arr[i]);
                }
            }
        }
    }
}
