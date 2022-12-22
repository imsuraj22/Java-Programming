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
public class EvenOddCount
{
    public static void main(String[] args)
    {
        int[] a ={3,4,6,3,6,9,5,2,7,8,4};
        
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
        
        System.out.println("No of even no's are :"+even_count);
        System.out.println("No of odd no's are :"+odd_count);
    }
}
