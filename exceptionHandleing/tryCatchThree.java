import java.io.*;
import java.util.*;

class Name{
  private String name;

  void accept() throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please enter name ");
    name = br.readLine();
  }

  void display(){
    System.out.println(name);
  }


}

public class tryCatchThree{
  public static void main(String args[]) throws IOException{
    Name name = new Name();
    name.accept();
    name.display();
  }
}
