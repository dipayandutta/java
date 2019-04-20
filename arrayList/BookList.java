import java.io.*;
import java.util.*;

class Book {

  int id;
  String name ;
  String author;
  String publisher;
  int quantity;
  
  public Book(int id,String name , String author, String publisher, int quantity){
    this.id       = id;
    this.name     = name;
    this.author   = author;
    this.publisher= publisher;
    this.quantity = quantity;
  }
}

public class BookList{
  
  public static void main(String args[]){
    
    //Creaing the arrayList
   ArrayList<Book> list = new ArrayList<Book>();

   //Creating books
   Book Python = new Book(1,"Python","XYZ","abc",10);
   Book java   = new Book(2,"Java","asd","eer",4);
   // Adding items in the list
   list.add(Python);
   list.add(java);
   //Traversing the list
   for (Book book:list){
    System.out.println(book.id+"=>"+book.name+" "+book.author);
   }
   
   
   borrow("python",list);
  }

  public static void borrow(String bookName,ArrayList<Book> list){
    for(Book book:list){
      if (bookName == book.name){
        System.out.println("Name Present check for availability!");
      }
      else{
        System.out.println("Please check the catalog!");
      }
    }
   }
}
