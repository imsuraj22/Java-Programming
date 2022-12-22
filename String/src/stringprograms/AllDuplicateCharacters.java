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
public class AllDuplicateCharacters
{
    public static void main(String[] args)
    {
        String str = "abcdaabdcba";
        str =str.replaceAll("\\s", "");
        int[] arr=new int[126];
        
        for(int i=0; i<str.length(); i++)
        {
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>1)
            {
                System.out.println((char)i+" repeated "+arr[i]+" times");
            }
        }
        
    }
 
}
