
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author suraj
 */
public class Ecommerce {
     public static void main(String[] args) {
         List<Order> orders= new ArrayList<Order>();
         List<String> item1= new ArrayList<String>();
         item1.add("Shirt");
         item1.add("Pants");
         item1.add("Jeans");
         
         List<String> item2= new ArrayList<String>();
         item2.add("Socks");
         item2.add("Tie");
         item2.add("Pants");
         
         orders.add(new Order(101, item1, true));
         orders.add(new Order(102, item2, true));
         System.out.println(Data.getNames(orders));
         
    }
}

class Data{
    public static List<String> getNames(List<Order> orders){
        List<String> itemNames = new ArrayList<String>();
        for(Order order : orders)
        {
            itemNames.addAll(order.itemNames);
        }
        return itemNames;
    }
}

class Order{
    public int orderID;
    public List<String> itemNames;
    public boolean COD;
    
    Order(int orderID, List<String> itemNames, boolean COD)
    {
        this.orderID=orderID;
        this.itemNames=itemNames;
        this.COD=COD;
    }
}
