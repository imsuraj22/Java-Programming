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
public class MinOccuringChar
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
        int min=str.length();
        char c =' ';
        for(int i=0; i<str.length(); i++)
        {
            if(min>arr[str.charAt(i)])
            {
            min=arr[str.charAt(i)];
            c=str.charAt(i);
            }
        }
        System.out.println("Minimum occuring character is: "+c);
    }
}
