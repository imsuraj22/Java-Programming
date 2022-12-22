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
public class CountNoOfWords 
{
    public static void main(String[] args)
    {
        String str = "This is my first demo";
        int leng=str.length();
        boolean b = true;
        int count=0;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)==' ')
            {
                b=true;
            }
            else if(b==true)
            {
                b=false;
                count++;
                
            }
        }
        System.out.println("no of words are: "+count);
    }
}
