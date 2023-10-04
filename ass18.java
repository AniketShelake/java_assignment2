// Print the average of three numbers entered by user by creating a class named 'Average' 
// having a method to calculate and print the average.

import java.util.Scanner;

class Average{
    void calculate(int a,int b,int c){
        int avg= (a+b+c)/3;
        System.out.println(avg);
    }
}
public class ass18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Average avg=new Average();
        avg.calculate(a, b, c);
       

    }
}
