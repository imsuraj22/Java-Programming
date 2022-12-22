/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

/**
 *
 * @author suraj
 */
public class Sum
{ 
void sum(int x, int y) 
{ 
    int c = x+y; 
    System.out.println("Addition of two numbers:"+c);
} 
void sum(int x, int y, int z) 
{ 
    int c = x+y+z; 
    System.out.println("Addition of three numbers:"+c); 
} 
public static void main(String[] args) 
{ 
    Sum obj = new Sum(); 
    obj.sum ( 45,55); 
    obj.sum(45, 55, 65); 
} 
}