// Write a program to print the area of a rectangle by creating a class named 'Area' taking the 
// values of its length and breadth as parameters of its constructor and having a method named 
// 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered
//  through keyboard.

import java.util.Scanner;

class Area{
  int length;
  int breadth;
  Area(int length, int breadth){
    this.length=length;
    this.breadth=breadth;
  }
  void returnArea(){
    
    int area=length*breadth;
    System.out.println("Area of rectangle "+area);
  }
}
public class ass17 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter length of rectangle");
    int length=sc.nextInt();
    System.out.println("Enter breadth of rectangle");
    int breadth=sc.nextInt();
        Area a1=new Area(length, breadth);
        a1.returnArea();
    }
}
