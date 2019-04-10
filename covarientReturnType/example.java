import java.io.*;

//The Base class
class Base {
  Base get(){
    return this;
  }
}

// The Derived class
class Derived extends Base {
  Derived get(){
    return this;
  }

  void message(){
    System.out.println("This is the covariant return type code example");
  }
}

// The main classs
class example{
  public static void main(String args[]){
    new Derived().get().message();
  }
}
