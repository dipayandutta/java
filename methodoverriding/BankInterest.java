import java.io.*;


// The base class
class Bank{
  int getRateOfInterest(int amount){
    return amount*0;
  }
}

// Class for SBI
class SBI extends Bank {
  int getRateOfInterest(int amount){
    return amount*8;
  }
}

//Class for HDFC

class HDFC extends Bank {
  int getRateOfInterest(int amount){
    return amount*9;
   }
}


// The main class 
class BankInterest {
  public static void main(String args[]){
    SBI sbi = new SBI();
    HDFC hdfc = new HDFC();

    System.out.println(sbi.getRateOfInterest(10000));
    System.out.println(hdfc.getRateOfInterest(10000));

  }
}
