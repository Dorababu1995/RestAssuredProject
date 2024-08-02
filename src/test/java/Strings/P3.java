package Strings;

import java.util.Iterator;

public class P3 {
	public static void main(String[] args) {
		
		String input = "Software Enginer Dorababu";

		String[] split = input.split(" ");
		String rev = "";
		for(int i =split.length-1;i>=0;i--) {
			
			rev = rev+split[i]+" ";
			
		}
		System.out.println(rev);
		
	}

}
