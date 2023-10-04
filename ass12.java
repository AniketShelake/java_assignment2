// Create a Book class and a Library class. The Library class should have a list of books.
//  Implement methods in the Library class to add books to the library, check out books, and return books.
//   Create a library object and perform these operations.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Book{
    
}
class Library{
   List<String> libook=new ArrayList<String>();
   
   Scanner sc=new Scanner(System.in);

   boolean add_book(){
    String book=sc.nextLine();
    return libook.add(book);

    
   }
   boolean check_out(){
    String submited_book=sc.nextLine();
    return libook.remove(submited_book);
   }
@Override
public String toString() {
    return "Library [libook=" + libook + "]";
}
   
   
}
public class ass12 {
    public static void main(String[] args){
        Library li=new Library();
        
        li.add_book();
        li.add_book();
        System.out.println(li);
        li.check_out();
        System.out.println(li);
    }
}
