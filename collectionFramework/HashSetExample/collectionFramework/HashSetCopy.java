package collectionFramework;
import java.util.HashSet;

public class HashSetCopy {
	public static void main(String args[]) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		
		System.out.println(hs);
		
		HashSet<String> subSet = new HashSet<String>();
		//Copy the hs HashMap object in the subSet object
		subSet.addAll(hs);
		subSet.add("Fourth");
		
		System.out.println(subSet);
	}
}
