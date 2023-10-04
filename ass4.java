// Create a Rectangle class with attributes length and width. Add a method to 
// calculate the area of the rectangle. Create a Rectangle object and calculate its area.

import java.util.Scanner;

class Rectangle{
    int length;
    int width;
    int area(int l,int w){
        length=l;
        width=w;
        return l*w;
    }
}
public class ass4 {
    public static void main(String[] args){
        Rectangle rec=new Rectangle();
        System.out.println("Enter length of rectangle");
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        System.out.println("Enter width of rectangle");
        //Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        System.out.println("Area of rectangle "+rec.area(l,w));
    }
}
