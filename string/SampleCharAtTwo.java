import java.io.*;

public class SampleCharAtTwo{

  public static void main(String args[]){
    String str = new String("Java");
    int strLength = str.length();

    // The last Character is present at the string is length-1 index
    System.out.println("Character at the last index "+str.charAt(strLength-1));
  }
}
