import java.io.*;

public class userException extends Exception{
   
   private static int accNo[]   = {100,101,102,103};
   private static String name[] = {"Python","Java","C++","C"};
   private static double bal[]  = {1000.12,1000,999,999};
/*
   userException(){
   
   }
*/
   //Parameterized Constructor
   userException(String str){
    super(str);
   }

   public static void main(String args[]){
    
    try{
      
      System.out.println("ACCNO"+"\t"+"Name"+"\t"+"Balance");

      for(int i=0;i<5;i++){
        System.out.println(accNo[i]+"\t"+name[i]+"\t"+bal[i]);
        if (bal[i]<1000){
          userException myException = new userException("Balance is less");
          throw myException;
        }
      }

    }catch(userException myException){
      myException.printStackTrace();
    }
   }
}
