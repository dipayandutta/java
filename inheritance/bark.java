import java.io.*;

class cat{
  void barkCat(){
    System.out.println("Meow");
  }
}

class Dog extends cat{
  void barkDog(){
    System.out.println("Grrrr....");

  }
}

class bark {
  public static void main(String args[]){
    Dog jackey = new Dog();
    jackey.barkDog();
    jackey.barkCat();
  }
}
