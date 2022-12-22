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
public class Price {

int itemId;
double price;
String size;

public Price(int itemId) {
this.itemId = itemId;

}
public Price(String size, int itemId, double price) {
this.size = size;
this.itemId = itemId;
this.price = price;
}

public static void main(String args[]) {
Price ps = new ps(1001);
System.out.println("Price of the selected item" + itemId + " is $25");

Price size = new size(34);
System.out.println("Prize of the item" + size + " is $23");
}

}