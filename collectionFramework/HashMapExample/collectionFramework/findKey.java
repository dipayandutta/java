package collectionFramework;
import java.util.HashMap;

public class findKey {
	public static void main(String args[]) {
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(1, "java");
		hm.put(2,"python");
		
		if(hm.containsKey(1)) {
			System.out.println("present");
		}else {
			System.out.println("Absent");
			
		}
		searchKey(hm);
	}
	public static void searchKey(HashMap<Integer,String> hm) {
		if(hm.containsKey(1)) {
			System.out.println("Key is present");
		}
		else {
			System.out.println("Key is not present");
		}
	}
}
