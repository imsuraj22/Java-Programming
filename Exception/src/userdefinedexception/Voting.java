/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinedexception;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class Voting
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=s.nextInt();
        
        if(age<18)
        {
            try
            {
                throw new InvalidAgeException("You cannot vote as your age is below 18");
            }
            catch(InvalidAgeException e)
                    {
                        System.out.println(e);
                    }
        }
        else
        {
            System.out.println("You can vote now..!!");
        }
        System.out.println("---------------Thank you---------------");
    }
}
