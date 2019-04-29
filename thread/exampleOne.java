import java.io.*;

public class exampleOne implements Runnable{
  public void run(){
    System.out.println("thread is running ... ");
  }

  public static void main(String args[]) throws IOException{
    exampleOne one = new exampleOne();
    Thread thrOne  = new Thread(one);
    thrOne.start();
  }
}
