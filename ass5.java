// Create a Person class with attributes like name, age, and gender. 
// Add a method to introduce the person by printing their name, age, and gender.

import java.util.Scanner;

class Person{
    String name;
    int age;
    String gender;
    public void indro(){
         System.out.println("Myname is: "+name+" age: "+age+" gender: "+gender);
    }
}

public class ass5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Name of person:");
        String name=sc.nextLine();
        System.out.println("Age of person:");
        int age=sc.nextInt();
        System.out.println("Gender of person: ");
        String abc=sc.nextLine();
        String gender=sc.nextLine();
        Person p1=new Person();
        p1.name=name;
        p1.age=age;
        p1.gender=gender;
        p1.indro();
        Person p2=new Person();
        p2.name="vishal";
        p2.age=23;
        p2.gender="male";
        p2.indro();
    }
}
