// Write a program that would print the information (name, year of joining, salary, address) 
// of three employees by creating a class named 'Employee'. The output should be as follows:
class Employee{
    String name;
    int year_of_joining;
    int salary;
    String address;
Employee(String name,
    int year_of_joining,
    String address){
        this.name=name;
        this.year_of_joining=year_of_joining;
      //  this.salary=salary;
        this.address=address;
        System.out.println(name+"                  "+year_of_joining+"                         "+address);

}
}
public class ass21 {
    public static void main(String[] args){
        System.out.println("Name                        Year of Joining                      Address");
        Employee e1=new Employee("Robert ",            1994,           " 64C- WallsStreat");
        Employee e2=new Employee("Sam" ,               2000,              "  68D- WallsStreat");
        
    }
}
