import java.io.*;

public class exampleTwoSleep extends Thread{
  public void run(){
    for (int i=0;i<5;i++){
      try{
        Thread.sleep(50);
      }catch(InterruptedException e){
        System.out.println(e);
      }
      System.out.println(i);
    }
  }

  public static void main(String args[]) throws IOException{
    exampleTwoSleep one = new exampleTwoSleep();
    exampleTwoSleep two = new exampleTwoSleep();

    one.start();
    two.start();
  }
}
