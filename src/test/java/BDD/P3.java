package BDD;

import java.util.HashMap;
import java.util.Set;

public class P3 {

	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		
		hashmap.put(101, "java");
		hashmap.put(101 ,"hello");
		hashmap.put(103, "apac");
		hashmap.put(105, "emea");
		
		
		System.out.println(hashmap);
		
		
		Set<Integer> keySet = hashmap.keySet();
		
		
		System.out.println(keySet);
	}
}
