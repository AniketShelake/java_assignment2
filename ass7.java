// Create an Employee class with attributes like name, employee_id, and salary.
//  Add a method to give a salary raise to an employee. 
//  Create an employee object, give them a raise, and print their updated salary.

import java.util.Scanner;

class Employee{
    String name;
    int employee_id;
    float salary;
    int increment;
    float raise(float increment){
        
        float raise=increment+salary;
        return raise;
    }
}

public class ass7 {
    public static void main(String[] args){
         Employee e1=new Employee();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Employee name");
         String name=sc.nextLine();
         System.out.println("Enter employee id");
         int employee_id=sc.nextInt();
         System.out.println("Enter salary of employee");
         e1.salary=sc.nextFloat();
         System.out.println("Enter increment of employee");
         float increment=sc.nextFloat();
         System.out.println("Total raise of salary "+e1.raise(increment));
         

    }
}
