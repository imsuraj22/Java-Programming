/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayprograms;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class ArrayCharVovals 
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        
        String[] arr=new String[10];
        
        for(int i=0; i<=9; i++)
        {
            System.out.println("Enter word "+(i+1));
            arr[i]=s.next();
        }
        
        System.out.println("=================================================");
        
        String token;
        for(int i=0; i<=9; i++)
        {
            token=arr[i];
            char c1=token.charAt(0);
            char c2=token.charAt(token.length()-1);
            if((c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u') && (c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u'))
            {
                System.out.println(arr[i]);
            }
        }
    }
}
