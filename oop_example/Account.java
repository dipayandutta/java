import java.io.*;

class BankAccount{
  
  int id;
  String customerName;
  float amount;
  int accNumber;

  void insertRecord(int i, String n, float a,int acc_no){
    this.id = i;
    this.customerName = n;
    this.amount = a;
    this.accNumber = acc_no;
  }

  void deposit(float amt){
    amount += amt;
  }

  void currentBalance(){
    System.out.println("Available balance in your account "+this.amount);
  }

  void withDraw(float amt){
    if (amount<amt){
      System.out.println("Unable to withdraw , Not Enough Balance");

    }
    else{
      amount -= amt;
    }
  }

  void displayInformation(){
    System.out.println("Customer ID "+this.id);
    System.out.println("Customer Name "+this.customerName);
    System.out.println("Account Number "+this.accNumber);
  }
}

class Account {
  
  public static void main(String args[]){
    BankAccount mrx = new BankAccount();
    
    mrx.id = 1;
    mrx.customerName = "Mr X";
    mrx.amount = 10000;
    mrx.accNumber = 12345;

    mrx.insertRecord(mrx.id,mrx.customerName,mrx.amount,mrx.accNumber);
    mrx.currentBalance();
    mrx.displayInformation();
    mrx.deposit(1234);
    mrx.currentBalance();
    mrx.withDraw(1000);
    mrx.currentBalance();
    mrx.withDraw(20000);
    mrx.currentBalance();
  }
}
