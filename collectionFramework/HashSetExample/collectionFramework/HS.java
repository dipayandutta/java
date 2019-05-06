
package collectionFramework;
import java.io.*;
import java.util.*;
public class HS {
	public static void main(String args[]) throws IOException {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("Java");
		hs.add("Python");
		
		System.out.println(hs);
		
		for(String item : hs) {
			
			System.out.println(item);
		}
		
		// Traversing through Iteration
		System.out.println("Using Iterator");
		System.out.println("----------------------");
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			System.out.println(str);
		}
	}
}
