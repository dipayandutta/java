import java.io.*;
import java.util.*;

class exampleList{
  public static void main(String args[]){
    
    ArrayList<String> arrLst = new ArrayList<String>();

    arrLst.add("Issac");
    arrLst.add("Albert");
    arrLst.add("Jagdish");

    //Initial ArrayList
    System.out.println("Initial Array List ");
    System.out.println(arrLst);


    //Removing a specific item from the list
    arrLst.remove("Albert");

    //Print the list
    System.out.println("Current List");
    System.out.println(arrLst);

    //Remove an item using index
    arrLst.remove(0);
    System.out.println("Current List ....");
    System.out.println(arrLst);
    
    // Removing elements based on the specified condition
    arrLst.removeIf(str -> str.contains("Jagdish"));
    System.out.println(arrLst);

    //Check the arrayList is empty or not
    System.out.println(arrLst.isEmpty());
  }


}
