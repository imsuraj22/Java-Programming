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
public class ReverseString
{
    public static void main(String[] args)
    {
        String str = "Suraj";
        String rev="";
        int leng= str.length();
        
        for(int i= leng-1; i>=0; i--)
        {
            rev = rev+str.charAt(i);
            
        }
        System.out.println(rev);
    }
}
