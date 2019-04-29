import java.io.*;

public class tryCatchTwo{
  public static void main(String args[]){
  
    try{
      int array[] ={12,3,45};
      System.out.println(array[2]);
      System.out.println(array[6]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e);
    }
  }
}
