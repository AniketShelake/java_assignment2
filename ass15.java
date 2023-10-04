// Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
// by creating a class named 'Triangle' without any parameter in its constructor.
// Let a,b,c be the lengths of the sides of a triangle. The area is given by:
// Area	=	 √	 p	 (	p	−	a	) 	(	p	−	b	)	 (	p	−	c	)    
// where p is half the perimeter, or   
// a	+	b	+	c 
// 2

// Write a program to print the area and perimeter of a triangle having sides of 3, 4 
// and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.
  
class Triangle{
    int side1;int side2;int side3;
    double area(int side1,int side2,int side3){
        double p=(side1+side2+side3)/2;
        double a=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        return a;
    }
    int perimeter(int side1,int side2,int side3){
        return side1+side2+side3;
    }
    Triangle(){}
    Triangle(int side1,int side2,int side3){
       this.side1=side1;
       this.side2=side2;
       this.side3=side3;
    }
    void area(){
        double p=(side1+side2+side3)/2;
        double a=Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        System.out.println("Area of rectangle "+a);
    }
    void perimeter(){
        int per=side1+side2+side3;
        System.out.println(per);
    }
}
public class ass15 {
    public static void main(String[] args){
        Triangle t1=new Triangle();
     double t=  t1.area(3, 4, 5);
    System.out.println(t);
     System.out.println(t1.perimeter(3, 4, 5));
     Triangle t2=new Triangle(3, 4, 5);
     t2.area();
    }
    
}
