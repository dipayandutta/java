import java.io.*;

public class charFreq{
  public static void main(String args[]){
    String str = new String("Welcome World");
    freqCalc(str);
  }

  static void freqCalc(String str){
    char chr = 'W';
    int count = 0;
    for(int i=0;i<str.length();i++){
      if (chr == str.charAt(i)){
        count += 1;
      }
    }
    System.out.println(count);
  }
}
