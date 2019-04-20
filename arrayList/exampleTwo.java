import java.io.*;
import java.util.*;

class exampleTwo{
  public static void main(String args[]){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("Python");
    list.add("MySQL");

    Iterator itr = list.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
