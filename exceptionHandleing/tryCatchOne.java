import java.io.*;

public class tryCatchOne{
  public static void main(String args[]){
    try{
      int a = 30;
      int result = a/0;
    }
    catch(ArithmeticException e){
      System.out.println(e);
    }
    System.out.println("==========");
  }
}
