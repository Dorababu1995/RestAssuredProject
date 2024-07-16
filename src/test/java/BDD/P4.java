package BDD;

import java.util.Arrays;
import java.util.Iterator;

public class P4 {

	public static void main(String[] args) {
		
		
		 String input = "My name is Rajat";
		 
		 input = input.replace("\\s+", "");
		 
		 char[] charArray = input.toCharArray();
		 
		
		 Arrays.sort(charArray);
		 
		 
		String s = new String(charArray);
		
		System.out.println(s);
		 
	}
}
