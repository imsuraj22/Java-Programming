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
public class PalindromeString
{
    public static void main(String[] args)
    {
         String str = "abcba";
        String rev="";
        int leng= str.length();
        
        for(int i= leng-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);
            
        }
        if(str.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
