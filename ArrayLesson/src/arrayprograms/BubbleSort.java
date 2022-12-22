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
public class BubbleSort 
{
    static void sorting(int[] a)
    {
      for(int pass=0; pass<a.length; pass++)
      {
            int temp;
            boolean b =false;
            for(int i=0; i<a.length-1-pass; i++)
            {
                if(a[i]>a[i+1])
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
        int[] arr ={20,40,54,45,80,96,70,100};
        
        BubbleSort.sorting(arr);
    }
}
