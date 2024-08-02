package pdf;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class P2 {
	
	public static void main(String[] args) {
		
		String input = "permission";
		
		char[] arr = input.toCharArray();
		
		boolean isduplicate =false ;
		
		StringBuilder builder = new StringBuilder();
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					
					isduplicate=true;
					break;
				}
			}
			if (!isduplicate) {
				builder.append(arr);
			}
			
		}
		
		System.out.println(builder.toString());
		
	}

}
