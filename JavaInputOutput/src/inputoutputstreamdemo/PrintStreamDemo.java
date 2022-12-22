/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutputstreamdemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 *
 * @author suraj
 */
public class PrintStreamDemo 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        PrintStream ps = new PrintStream("D:\\Test\\abcd.txt");
        ps.println("Suraj");
        ps.println(10);
        ps.println("Demo");
        ps.close();
    }
}
