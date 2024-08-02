package Arrays;

import java.util.HashSet;
import java.util.Set;

public class P1 {
	public static void main(String[] args) {
		
		//common elements
		
		int[] arr1 = {1, 2, 3, 4, 5};
		int[] arr2 = {4, 5, 6, 7, 8};
		 
		Set<Integer> hashset = new HashSet<Integer>();
		Set<Integer> commonset = new HashSet<Integer>();

	
		for(int num : arr1) {
			
			hashset.add(num);
		}
		for(int num1: arr2) {
			if(hashset.contains(num1)) {
				commonset.add(num1);
			}
		}

		
		System.out.println(hashset);
		System.out.println(commonset);
	}

}
