package Arrays;

import java.util.HashSet;
import java.util.Set;

public class P10 {
	
	public static void main(String[] args) {
		
		int arr[]= {2,34,3,2,34,56,78,89,3};
		int temp;
		for(int i =0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {			
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}	
		}	
	}
}
