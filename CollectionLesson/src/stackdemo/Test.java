/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackdemo;

import java.util.Stack;

/**
 *
 * @author suraj
 */
public class Test 
{
    public static void main(String[] args)
    {
        Stack s = new Stack();
        s.push(22);
        s.push(23);
        s.push(24);
        s.push(25);
        
        System.out.println(s);
        System.out.println(s.peek());   // it will print last element
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
    }
}
