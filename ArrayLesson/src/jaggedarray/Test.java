/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaggedarray;

/**
 *
 * @author suraj
 */
public class Test
{
    public static void main(String[] args)
    {
            int[][] a={{10,20,30,40},{50,60,70},{80,90,100,200,300}};
            for(int i=0; i<a.length; i++)
            {
                for(int j=0;j<a[i].length; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
    }
}
