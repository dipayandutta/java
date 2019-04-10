import java.io.*;

//This is the base class
class Vehcile{
  void run(){
    System.out.println("Vehcile is running");
  }
}

// Creating the derived class
class Bike extends Vehcile{
  public void run(){
    System.out.println("Bike is moving");
  }
}

//The main class
class problemOne{
  public static void main(String args[]){
    Bike honda = new Bike();
    honda.run();
  }
}
