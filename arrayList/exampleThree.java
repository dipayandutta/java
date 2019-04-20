import java.io.*;
import java.util.*;

public class exampleThree{
  public static void main(String args[]){
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("Python");
    list.add("MySQL");

    for (String obj:list){
      System.out.println(obj);
    }
  }
}
