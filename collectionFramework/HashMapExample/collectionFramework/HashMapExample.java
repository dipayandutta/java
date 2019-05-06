package collectionFramework;

import java.util.HashMap;
import java.util.Set;

public class HashMapExample {
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("first", "Java");
		hm.put("second", "Python");
		
		//System.out.println(hm);
		Set<String> keys = hm.keySet();
		for(String key:keys) {
			//System.out.println(key+hm.get(key));
			//print all keys only
			System.out.println(key);
			//Print all Values only
			//System.out.println(hm.get(key));
		}
	}
}
