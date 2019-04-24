import java.io.*;

public class stringContains{
  public static void main(String args[]){
    String strOne = new String("Hello World");
    String strTwo = new String("World");

    if (strOne.contains(strTwo)){
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
  }
}
