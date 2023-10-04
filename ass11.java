// Create a class called Product with attributes like name, price, and quantity_in_stock.
//  Create a list of product objects to represent a catalog of products, and print the details of each 
//  product in the catalog.

import java.util.ArrayList;
import java.util.Iterator;

 class Product{
    public String name;
    float price;
    int quantity_in_stock;
    Product(String name, float price, int quantity_in_stock){
         this.name=name;
         this.price=price;
         this.quantity_in_stock=quantity_in_stock;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity_in_stock=" + quantity_in_stock + "]";
    }
    


}
 class ass11 {
    public static void main(String[] args){
    ArrayList<Product> li=new ArrayList<>();
     li.add(new Product("Choclate ",100,5));
     li.add(new Product("Brush", 20.10f,10));
     li.add(new Product("paste", 50, 20));
     Iterator iterator=li.iterator();
     while(iterator.hasNext()){
        System.out.println(iterator.next()+" ");
        System.out.println();
     }
    }

}
//why by using tostring it giving output
