import java.io.*;

public class SampleCharAtThree{
  public static void main(String args[]){
    String str = new String("Welcome to the Java programming");
    int spaceCount = 0;
    int strLength = str.length();
    for(int i=0;i<strLength;i++){
      System.out.println("char at "+ i +"==> "+str.charAt(i));
      if(str.charAt(i) == ' '){
        spaceCount += 1;
      }
    }
    System.out.println("Space Count "+spaceCount);
    frequency(str);
  }

  static void frequency(String str){
    System.out.println(str);
  }
}
