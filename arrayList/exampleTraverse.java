import java.io.*;
import java.util.*;

public class exampleTraverse{

  public static void main(String args[]){
    
    ArrayList<String> list = new ArrayList<String>();
    list.add("Java");
    list.add("Python");
    list.add("MySQL");

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
    System.out.println("Traversing the List through the List Iterator");

    ListIterator<String> lstItr = list.listIterator(list.size());
    while(lstItr.hasPrevious()){
      String str = lstItr.previous();
      System.out.println(str);
    }

    System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

  

  System.out.println("Traversing List Through Loop");
  for(int i=0;i<list.size();i++){
    System.out.println(list.get(i));
  }

  System.out.println("Traversing List Through forEach");
  list.forEach(a->{
    System.out.println(a);
  });

  System.out.println("Traversing list through forEachRemaning() method");
  Iterator <String> itr = list.iterator();
  itr.forEachRemaining(a->{
    System.out.println(a);
  });
  }
}
