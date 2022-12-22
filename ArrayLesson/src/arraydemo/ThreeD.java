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
public class ThreeD
{
    public static void main(String[] args) 
    {
         int[][][] a={{{10,20,30},{40,50,60}},{{70,80,90}, {100,200,300}}};
        
        System.out.println(a);          //[[[I@xxxxx
        System.out.println(a[1]);       //[[I@xxxxx
        System.out.println(a[0][0]);    //[I@xxxxx
        System.out.println(a[0][0][0]); //10
        
        System.out.println("----------------------------");
        
        System.out.println(a.length);               //2
        System.out.println(a[0].length);            //2
        System.out.println(a[0][0].length);         //3
        //System.out.println(a[0][2].length);
        
        System.out.println("-------------------------------");
        
        for(int i=0; i<a.length; i++)
        {
            for(int j=0; j<a[i].length; j++)
            {
                for(int k=0; k<a[i][j].length; k++)
                {
                    System.out.print(a[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
