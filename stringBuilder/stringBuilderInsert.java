import java.io.*;

class stringBuilderInsert{
  public static void main(String args[]){
    String msg       = "Hello World";
    StringBuilder sb = new StringBuilder(msg);
    sb.insert(1,"Java Code");

    System.out.println(sb);
  }
}
