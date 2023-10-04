//Create a Student class with attributes like name, age, and grade. 
//Create multiple Student objects and print their details.

 class Student{
   String name;
   int age;
   int grade;
   Student(String n,int a,int grade){
     name=n;
     age=a;
     this.grade=grade;
   }
   void display(){
    System.out.println(name+" "+age+" "+grade);
   }
}
public class ass2 {
    public static void main(String[] args){
      Student s1=new Student("Aniket", 19, 9);
      Student s2=new Student("Rohit", 20, 8);
      s1.display();
      s2.display();
    } 
}
