import java.io.*;

public class stringisEmpty{
  public static void main(String args[]){
    String strOne = new String("");
    String strTwo = new String("Hello");

    System.out.println(strOne.isEmpty());
    System.out.println(strTwo.isEmpty());
  }
}
