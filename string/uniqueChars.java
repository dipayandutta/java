import java.io.*;

public class uniqueChars{
  
  static final int NO_OF_CHARS = 256;

  static void printUnique(String str){
    int[] count = new int[NO_OF_CHARS];
    int i;
    for(i=0;i<str.length();i++){
      if(str.charAt(i) != ' '){
        count[(int)str.charAt(i)]++;
      }
    }
    int n = i;
    for (i =0;i<n;i++){
      if(count[(int)str.charAt(i)] == 1){
        System.out.println(str.charAt(i));
      }
    }
   } 
  public static void main(String args[]){
    String str = "Hello World";
    printUnique(str);
  }
}
