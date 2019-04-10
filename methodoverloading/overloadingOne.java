import java.io.*;

class Adder{
  public static int addition(int a , int b){
    return a+b;
  }
  public static int addition(int a , int b , int c){
    return a+b+c;
  }
}

class overloadingOne{
  
  public static void main(String args[]){
    
    Adder add = new Adder();
    System.out.println(add.addition(2,3));
    System.out.println(add.addition(2,3,3));
  }
}
