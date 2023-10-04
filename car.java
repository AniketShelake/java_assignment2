// Create a function called race that takes two cars as arguments and prints a message like 
// "Car1 is faster than Car2" or "Car2 is faster than Car1" based on their attributes 
// (e.g., speed). Test the function with different cars.

import java.util.Scanner;

class car{
    String name;
    int speed;
    
       
    void race(int speed1, int speed2){
       
        if(speed1>speed2){
            System.out.println("Car1 is faster than car2");
        }
        else{
            System.out.println("Car2 is faster than car1");
        }
    }



    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        car c1=new car();
        car c2=new car();
        System.out.println("Enter speed of car1");
        c1.speed=sc.nextInt();
        System.out.println("Enter speed of car2");
        c2.speed=sc.nextInt();
        c1.race(c1.speed,c2.speed);
    }
}
