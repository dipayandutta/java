import java.io.*;
import java.util.ArrayList;

public class stringIgnoreCase{
  public static void main(String args[]){
    String strOne = new String("Java Python");
    ArrayList<String> list = new ArrayList<String>();
    list.add("C++");
    list.add("lisp");
    list.add("java python");
    int present = 0;
    for(String str: list){
      if(str.equalsIgnoreCase(strOne)){
        present += 1;
      }
    }
    if (present >=1){
      System.out.println("Present");
    }
    else{
      System.out.println("Not Present");
    }
  }
}
