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
public class PasswordGenerator
{
    static String name;
     static int dob;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name");
        name=s.next();
        System.out.println("Enter your birth year");
        dob=s.nextInt();
        
        String newname = PasswordGenerator.getSpecifiedString();
        int newdob = PasswordGenerator.dobAlgo();
        
        String newpass = "SP"+newname+"@"+newdob;
        System.out.println("Your password is :"+newpass);
    }
    
    static String getSpecifiedString()
    {
        String newname;
        char c = name.charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
        {
            char c1 = name.charAt(0);
            char c2 = name.charAt(1);
            newname=String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }
        else
        {
            char c1= name.charAt(0);
            char c2= name.charAt(name.length()-1);
            newname=String.valueOf(c1)+String.valueOf(c2).toUpperCase();
        }
        return newname;
    }
    
    static int dobAlgo()
    {
        int newdob=0, rem;
        while(dob!=0)
        {
            rem=dob%10;
            newdob=newdob*10+rem;
            dob=dob/10;
        }
        return newdob;
    }
}
