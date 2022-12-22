/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringdemo;

/**
 *
 * @author suraj
 */
public class Demo 
{
    public static void main(String[] args)
    {
      String str = new String("Suraj");
      System.out.println(str);
      
      byte[] b ={97,98,99,100};
      String str2 = new String(b);
      System.out.println(str2);
      
      char[] c = {'a','b','c','d'};
      String str3 = new String(c);
      System.out.println(str3);
    }
}
