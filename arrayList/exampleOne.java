import java.util.*;
import java.io.*;

public class exampleOne{
  public static void main(String args[]){
  //Creating new arralist
    ArrayList<String> list = new ArrayList<String>();
    list.add("Python");
    list.add("java");
    list.add("MySQL");

    System.out.println(list);

    for(int i=0;i<list.size();i++){
      System.out.println(i);
    }
  }
}
