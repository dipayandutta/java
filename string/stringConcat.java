import java.io.*;

public class stringConcat{
  public static void main(String args[]){
    String strOne = new String("Hello");
    String strTwo = new String("World");
    //Concat 
    String strThree = strOne.concat(strTwo);
    System.out.println(strThree);

    String strFourth = new String("dipayan");
    String strFifth  = new String("gmail");
    String strSixth  = new String("com");

    String emailID = strFourth.concat("@").concat(strFifth).concat(".").concat(strSixth);
    System.out.println(emailID);
  }
}
