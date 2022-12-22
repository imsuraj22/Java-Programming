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
public class Participants
{
    private String name,branch;
    static String registrationID;
    static int counter;
    private long contactNumber;
    
   Participants(String name, long contactNumber,String branch)
   {
       this.name=name;
       this.contactNumber=contactNumber;
       this.branch=branch;
   }
    
    static {
         counter = 1001;
    }
    
    public String getRegistrationID()
    {
        registrationID=Integer.toString(counter);
        counter = counter + 1;
        return registrationID;
        
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    
    public void setContactNumber(long contactNumber)
    {
        this.contactNumber=contactNumber;
    }
    public long getContactNumber()
    {
        return contactNumber;
    }
    public void setBranch(String branch)
    {
        this.branch=branch;
    }
    public String getBranch()
    {
        return branch;
    }
    
    public void display()
    {
        System.out.println("Hi " + getName() + "! Your Registration ID is D" + getRegistrationID());
    }
            
}
class MainMethod
{
    public static void main(String[] args)
    {
        
           Participants p = new Participants("suraj", 1234567897, "Computer");
           Participants p1 = new Participants("Ram", 1234987655, "Civil");

           p.display();;
           p1.display();
    }
}
