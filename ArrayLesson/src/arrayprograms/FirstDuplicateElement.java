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
public class FirstDuplicateElement
{
    public static void main(String[] args)
    {
        int[] a ={12,34,55,75,34,75,23,12,45,75,55};
        boolean b=false;
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=i+1; j<a.length; j++)
            {
                if(a[i]==a[j])
                {
                    System.out.println("Duplicate element is :"+a[i]);
                    b=true;
                }
            }
            if(b==true)
            {
                break;
            }
        }
    }
}
