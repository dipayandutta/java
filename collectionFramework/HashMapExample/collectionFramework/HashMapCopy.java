package collectionFramework;
import java.util.HashMap;
import java.util.Set;
public class HashMapCopy {
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap<String,String>();
		
		//Creating a HashMap
		hm.put("First",	"Java");
		hm.put("second", "Python");
		
		Set<String> keys = hm.keySet();
		for(String key: keys) {
			System.out.println(key+"\t"+hm.get(key));
		}
		
		//Creating a second HashMap
		HashMap<String,String> hmCopy = new HashMap<String,String>();
		hmCopy.putAll(hm);
		//Printing the copied HashMap
		System.out.println(hmCopy);
	}
}
