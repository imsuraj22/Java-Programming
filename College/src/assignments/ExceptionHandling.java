/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.util.Scanner;

/**
 *
 * @author suraj
 */
public class ExceptionHandling
{
    
    void div(int a, int b)
    {
        int res;
        try
        {
            res=a/b;
            System.out.println("division: "+res+"\n");
        }
        catch(ArithmeticException ae)
        {
            System.out.println("You shouldn't divide by zero");
            System.out.println("Arithmatic Exception handled successfully....\n");
        }
        
    }
    void arr()
    {
        String arr[]=new String[5];
        int index=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 names");
                for(int i=0; i<5; i++)
                {
                    arr[i]=sc.next();
                }
        try
        {
            System.out.println("Enter the index no to see the entered name \n");
            index=sc.nextInt();
            System.out.println("Entered name is: "+arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException ae)
        {
            System.out.println("OOPs!!!Array Index "+index+"out of bounds for length "+arr.length);
            System.out.println("ArrayIndexOutOfBounds Exception handled successfully....\n");
        }
         
     
    }
    void str(String str)
    {
        try
        {
            System.out.println("length of the string is: "+str.length()+"\n");  
        }
        catch(NullPointerException ne)
        {
            System.out.println("Null Pointer Exception arises!!");
            System.out.println("NullPointer Exception handled successfully....\n");
        }
        
    }
    public static void main(String[] args) 
    {
        ExceptionHandling ex = new ExceptionHandling();
        Scanner sc = new Scanner(System.in);
        int a,b,ch;
        
       while(true)
       {
            System.out.println("Which operation do you want to perform...");
        System.out.println("1: division");
        System.out.println("2: Array operation");
        System.out.println("3: Strings");
        System.out.println("Enter your choice....");
        ch=sc.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.println("Enter first number");
                a=sc.nextInt();
                System.out.println("Enter second number");
                b=sc.nextInt();
                ex.div(a,b);
                break;
            case 2:
                ex.arr();
                break;
            case 3:
                ex.str(null);
        }
       }
       
        

    }
}
