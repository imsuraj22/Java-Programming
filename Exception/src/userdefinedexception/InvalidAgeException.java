/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdefinedexception;

/**
 *
 * @author suraj
 */
public class InvalidAgeException extends RuntimeException
{

    public InvalidAgeException(String message)
    {
        super(message);
    }
    
}
