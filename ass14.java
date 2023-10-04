
// Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. 
// Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

// Assign and print the roll number, phone number and address of two students having names "Sam"
//  and "John" respectively by creating two objects of class 'Student'.
class Student{
    String name;
    int roll_no;
    String phone_number;
    String address;
    @Override
    public String toString() {
        return "Student [name=" + name + ", roll_no=" + roll_no + ", phone_number=" + phone_number + ", address="
                + address + "]";
    }
}
public class ass14 {
    public static void main(String[] args){
        Student student1=new Student();
        student1.name="Aniket";
        student1.roll_no=23;
        student1.address="Rui sawal road";
        student1.phone_number="9145403003";
       System.out.println(student1.toString());
    }
}
