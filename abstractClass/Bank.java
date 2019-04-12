import java.io.*;

abstract class RBank{
  abstract int getRateOfInterest();
}

class SBI extends RBank{
  int getRateOfInterest(){
    return 19;
  }
}

class HDFC extends RBank{
  int getRateOfInterest(){
    return 10;
  }
}

class Bank {
  public static void main(String args[]){
    RBank bank ;
    bank = new SBI();
    bank = new HDFC();

    System.out.println(bank.getRateOfInterest());


  }
}
