import java.io.*;

public class stringSplit{
  public static void main(String args[]){
    String strOne = new String("Hello World this is a string split example");
    String[] words = strOne.split("\\s"); // split on white space
    for (String w : words){
      System.out.println(w);
    }
  }
}
