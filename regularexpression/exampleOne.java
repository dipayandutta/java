import java.io.*;
import java.util.regex.*;

public class exampleOne{
  public static void main(String args[]){
    
    Pattern pattern = Pattern.compile(".s");
    Matcher match   = pattern.matcher("as");
    boolean result  = match.matches();

    System.out.println(result);
  }
}
