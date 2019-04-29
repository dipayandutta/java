import java.io.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class exampleTwo{
  public static void main(String args[]){
    
    Scanner sc = new Scanner(System.in);
    while(true){
      System.out.println("Enter regex pattern");
      Pattern pattern = Pattern.compile(sc.nextLine());
      System.out.println("Enter Text");
      Matcher matcher = pattern.matcher(sc.nextLine());

      boolean found = false;

      while(matcher.find()){
        System.out.println("Found the text in "+matcher.group()+"Starting at index"+matcher.start()+"and ending index"+matcher.end());
        found = true;
      }
      if(!found){
        System.out.println("Nothing found");
      }
    }
  }
}
