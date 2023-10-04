// Write a program to print the area of two rectangles having sides (4,5) and (5,8) 
// respectively by creating a class named 'Rectangle' with a method named 'Area' which returns 
// the area and length and breadth passed as parameters to its constructor.
class Rectangle{
    int Area(int length,int breadth){
        return length*breadth;
    }
}
public class ass16 {
    public static void main(String[] args){
        Rectangle rec=new Rectangle();
        System.out.println(rec.Area(4, 5));
        System.out.println(rec.Area(5, 8));
    }
}
