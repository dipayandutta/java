package collectionFramework;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class EntryObject {
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("First","Java");
		hm.put("Second","Python");
		
		//Getting value for the given key from hashmap
		Set<Entry<String,String>> entries = hm.entrySet();
		for(Entry<String,String> ent:entries) {
			System.out.println(ent.getKey()+"==>"+ent.getValue());
		}
	}
}
