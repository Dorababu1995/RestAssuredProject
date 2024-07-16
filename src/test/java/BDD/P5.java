package BDD;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;



public class P5 {

	
	public static void main(String[] args) {
		
		String input ="abbcccdeee";
		
		HashMap<Character, Integer> hashmap = new HashMap<Character, Integer>();
		
		char[] charArray = input.toCharArray();
		
		
		for (char c : charArray) {
			
			if (hashmap.containsKey(c)) {
				
				hashmap.put(c, hashmap.get(c)+1);
			}else {
				hashmap.put(c, 1);
			}
			
			
		}
		
			Set<Entry<Character, Integer>> entrySet = hashmap.entrySet();
		
			System.out.println(entrySet);
			
			
			
			
			
			
		
	}
}
