import java.io.*;

public class tryCatchMulti{
  public static void main(String args[]){
    try{
      int a = 10;
      int result ;
      result = a / 0;
    }catch(ArithmeticException e){
      System.out.println(e);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
}
