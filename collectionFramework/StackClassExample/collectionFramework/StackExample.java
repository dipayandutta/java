package collectionFramework;

import java.io.*;
import java.util.*;

public class StackExample {
	public static void main(String args[]) throws IOException{
		Stack<Integer> stack = new Stack<Integer>();
		
		int choice =0;
		int position;
		int element;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(choice<4) {
			System.out.println("STACK OPERATION");
			System.out.println("1 push an element");
			System.out.println("2 Pop an element");
			System.out.println("3 Search an element");
			System.out.println("4 Display the Stack Content");
			System.out.println("5 Exit the application");
			
			System.out.println("Choice");
			choice = Integer.parseInt(br.readLine());
			
			switch(choice) {
			case 1:
				System.out.println("Enter elements");
				element = Integer.parseInt(br.readLine());
				stack.push(element);
				break;
			
			case 2:// The Top most item shall be poped
				System.out.println("Enter Item to pop");
				element = Integer.parseInt(br.readLine());
				Integer obj = stack.pop();
				System.out.println("poped"+obj);
				break;
				
			case 3:
				System.out.println("Enter Item to search for");
				element = Integer.parseInt(br.readLine());
				position = stack.search(element);
				
				if(position == -1) {
					System.out.println("Item is not in the list");
				}
				else {
					System.out.println("Item is in the list "+position);
				}
				break;
				
			case 4:
				System.out.println("Items in the stack are as follows");
				for(Integer item : stack) {
					System.out.println(item);
				}
				break;
				
			default:
				return;
			
			}
			System.out.println("Stack Content "+stack);
		}
	}
}
