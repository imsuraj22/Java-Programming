/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursordemo;

import java.util.ArrayList;

/**
 *
 * @author suraj
 */
public class Test1
{
    String name;
    int id;

    @Override
    public String toString() {
        return name+", "+id;
    }
    
    public static void main(String[] args)
    {
        Test1 t1=new Test1();
        
        t1.name="suraj";
        t1.id=101;
        
        System.out.println(t1); //Test1@xxxxx
        
        //----------------------------------------------
        
        ArrayList al=new ArrayList();
        
        al.add("aaa");
        al.add("bbb");
        al.add("ccc");
        al.add("ddd");
        
        System.out.println(al); //[aaa, bbb, ccc, ddd]
    }
}
