// Create a Book class with attributes like title, author, and publication_year.
//  Create a Book object and print its details.

import java.util.Scanner;

class Book{
    String title;
    String author;
    int publication_year;
    void details(String title,String author,int publication_year){
        this.author=author;
        this.title=title;
        this.publication_year=publication_year;
        System.out.println(author+" write book "+title+" in "+publication_year);
    }
}
public class ass6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title of book");
        String title=sc.nextLine();
        System.out.println("Enter author of book");
        String author=sc.nextLine();
        System.out.println("Enter publication-year");
        int publication_year=sc.nextInt();
        Book b1=new Book();
        b1.details(title, author, publication_year);
    }
}
