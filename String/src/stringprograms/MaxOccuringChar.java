/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprograms;

/**
 *
 * @author suraj
 */
public class MaxOccuringChar 
{
    public static void main(String[] args)
    {
        String str="This is my first demo";
        str=str.replaceAll("\\s", "");
        int arr[] = new int[126];
        
        for(int i=0; i<str.length(); i++)
        {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        int max=-1;
        char c =' ';
        for(int i=0; i<str.length(); i++)
        {
            if(max<arr[str.charAt(i)])
            {
            max=arr[str.charAt(i)];
            c=str.charAt(i);
            }
        }
        System.out.println("Maximum occuring character is: "+c);
    }
}
