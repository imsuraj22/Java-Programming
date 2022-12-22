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
class Loan {
int interestRate;
Loan(int interestRate) {
this.interestRate = interestRate;
System.out.println("Request for loan");
}
}
public class HomeLoan extends Loan {
int interestRate;
HomeLoan () {
super(10);
interestRate = super.interestRate;
System.out.println("Request for home loan " + interestRate);
}
public static void main(String args[]) {
HomeLoan homeLoan = new HomeLoan ();
}
}