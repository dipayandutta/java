package collectionFramework;
import java.util.HashMap;

public class findValue {
	public static void main(String args[]) {
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("First","Java");
		hm.put("Second","Python");
		
		//containsValue
		System.out.println(hm);
		if(hm.containsValue("Java")) {
			System.out.println("Present");
		}else {
			System.out.println("Absent");
		}
	}
}
