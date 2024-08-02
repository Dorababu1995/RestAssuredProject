package Strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class P4 {

	public static void removeDuplicateChar(String s) {
		
		char[] charArray = s.toCharArray();
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		for (char c : charArray) {
			
			if(hashmap.containsKey(c)) {
				hashmap.put(c,hashmap.get(c)+1);
			}else {
				hashmap.put(c, 1);
			}
				
		}
		
		Set<Entry<Character, Integer>> entrySet = hashmap.entrySet();
		
		for (Entry<Character, Integer> entry : entrySet) {
			
			if (entry.getValue()>1) {
				System.out.println(entry.getKey());
			}
			
		}
			
		
		
	}
	public static void main(String[] args) {
		
		removeDuplicateChar("Dorababu");
	}
	
	
}
