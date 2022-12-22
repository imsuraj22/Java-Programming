/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author suraj
 */
public class CreateFile
{
      public static void main(String args[]) {  
               try {  
                       // Creating an object of a file  
                       File f0 = new File("D:FileOperationExample.txt");   
                       if (f0.createNewFile()) {  
                                  System.out.println("File " + f0.getName() + " is created successfully.");  
                       } else {  
                                  System.out.println("File is already exist in the directory.");  
                       }  
                       
                       if(f0.exists())
                       {
                           System.out.println("The name of the file is: " + f0.getName());  
                           
                           System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());  
                           
                           System.out.println("Is file writeable?: " + f0.canWrite());  
                           
                           System.out.println("Is file readable " + f0.canRead());    
                           
                           System.out.println("The size of the file in bytes is: " + f0.length());   
                       }
                       else
                           
                       {
                           System.out.println("The file does not exist."); 
                       }
                     } catch (IOException exception) {  
                              System.out.println("An unexpected error is occurred.");  
                              exception.printStackTrace(); 
                              
                  }   
        }  
    
}
