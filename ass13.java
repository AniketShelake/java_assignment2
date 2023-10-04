// Write a program to print the area of a rectangle by creating a class named 'Area' having 
// two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters 
// and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle
//  are entered through keyboard.

import java.util.Scanner;

class Area{
    Scanner sc=new Scanner(System.in);
    int breadth;
    int length;
    void  setDim(){
        System.out.println("Enter breadth of rectangle ");
         breadth=sc.nextInt();
       // this.breadth=breadth;
        System.out.println("Enter length of rectangle ");
         length=sc.nextInt();
       // this.length=length;
    }
   
    int getArea(){
         return length*breadth;
    }
}
public class ass13 {
    public static void main(String[] args){
        Area rect=new Area();
        rect.setDim();
        System.out.println("Area of Rectangle "+rect.getArea());
    }
}
