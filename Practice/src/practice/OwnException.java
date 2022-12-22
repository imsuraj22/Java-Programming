/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author suraj
 */
public class OwnException extends Exception {

    public OwnException(String str) {
        super(str);
    }
    
    public static void main(String[] args) throws OwnException {
        
        OwnException obj=new OwnException("Its a user defined exception...");
        throw obj;
        
    }
    
    
    
}
