// Create a class called Car with attributes like make, model, year, and price.
//  Create a list of car objects to represent an inventory of cars, and print the details of each car
//   in the inventory.

import java.util.ArrayList;

class car{
    int make;
    String model;
    int year;
    int price;
    car(int make, String model, int year,int price){
        this.make=make;
        this.model=model;
        this.price=price;
        this.year=year;
        System.out.println("make "+make+" model "+model+" price "+price);
    }
    void display(){
        System.out.println("make "+make+" model "+model+" price "+price);
    }
}
public class ass9 {
    public static void main(String[] args){
        ArrayList<car> list=new ArrayList<car>();
        list.add(new car(123, "bmw", 1990, 100000));
        list.add(new car(145,"mercedes",2000,30000));
        list.add(new car(345, "maruti", 2020, 20000));
       
    }
}
