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
class Super {
String name = "VIT";
int code = 25;
}
class Sub extends Super {
String name = "WU";
int code = 22;
public void display(){
Sub obj = new Sub();
System.out.println("Name: “"+obj.name);
System.out.println("Code: "+obj.code);
}
}
 class fieldhiding{
public static void main(String args[]){
new Sub().display();
}
}