import java.io.*;

abstract class Bike {
  abstract void run();
}

class Honda extends Bike{
  void run(){
    System.out.println("Its Working!");
  }

  public static void main(String args[]){
    Bike honda = new Honda();
    honda.run();
  }
}
