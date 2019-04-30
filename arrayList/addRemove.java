import java.io.*;
import java.util.*;

public class addRemove {
  
  public static void main(String args[]) throws IOException{
    ArrayList<String> list = new ArrayList<String>();

    list.add("Java");
    list.add("Python");

    /*Normal traversal of the list*/
    for(String item : list){
      System.out.println(item);
    }
    /*Adding new item in the specific position*/
    list.add(0,"c");
    list.add(3,"c++");

    /*Traversing again with new items in the list*/
    System.out.println("Traversing after insertion of new items");
    for(String item : list){
      System.out.println(item);
    }
    /*Removeing some items*/
    list.remove("c++");
    System.out.println("Final Arraylis is");
    for(String item:list){
      System.out.println(item);
    }
  }
}
