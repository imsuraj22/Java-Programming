/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;

/**
 *
 * @author suraj
 */
public class TwoD
{
    public static void main(String[] args)
    {
        
        
        int [][] a = {{10,20,30,40},{50,60,70,80}};
        
        System.out.println(a);
        System.out.println(a[0]);
        System.out.println(a[0][0]);
        System.out.println("------------------------------------------");
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                System.out.println(a[i][j]);
            }
        }
    }
}
