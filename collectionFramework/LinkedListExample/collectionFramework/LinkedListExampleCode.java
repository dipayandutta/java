package collectionFramework;

import java.io.*;
import java.util.*;

public class LinkedListExampleCode {
	public static void main(String args[]) throws Exception{
		LinkedList<String> linkedlist = new LinkedList<String>();
		
		linkedlist.add("Hello");
		linkedlist.add("Java");
		linkedlist.add("Python");
		
		System.out.println(linkedlist);
		
		String element;
		int position;
		int choice = 0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(choice < 5) {
			System.out.println("Linked List Operations");
			System.out.println("1 Display the Total List");
			System.out.println("2 Add items on the list");
			System.out.println("3 Pop Items from the list");
			
			System.out.println("5 Exit from the application");
			
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
				case 1:
					System.out.println("Items in the list are ");
					Iterator itr = linkedlist.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
					break;
					
				case 2:
					System.out.println("Enter element to enter");
					element = br.readLine();
					System.out.println("Enter the position");
					position = Integer.parseInt(br.readLine());
					linkedlist.add(position-1,element);
					break;
					
				case 3:
					break;
					
				case 4:
					break;
					
				case 5:
					break;
					
				default:
					return;
			}
		}
	}
}
