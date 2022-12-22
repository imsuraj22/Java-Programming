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
public class BubbleSortString 
{
    static void sorting(String[] a)
    {
      for(int pass=0; pass<a.length; pass++)
      {
            String temp;
            boolean b =false;
            for(int i=0; i<a.length-1-pass; i++)
            {
                if(a[i].compareTo(a[i+1])>0)
                {
                    temp=a[i];
                    a[i]=a[i+1];
                    a[i+1]=temp;
                    
                    b=true;
                }
            }
            if(b==false)
            {
                break;
            }
      }
      
        System.out.println("final list :");
        for(int i=0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        String[] arr ={"suraj", "avya", "sandya", "ayush", "shubhya", "pritam", "nilya"};
        
        BubbleSortString.sorting(arr);
    }
}
