package Arrays2d;

import java.io.IOException;

public class p1 {

	public static void main(String[] args) throws IOException {
	
		
		
		int[][] arr ={{9,2},{3,4},{0,0}};
		
		int[][] arr1 = {{9,2},{3,4},{3,5}};
		
		int[] s;
		
		int [] k;
		
		for(int i=0;i<arr1.length;i++) {
					s=arr[i];
					k=arr1[i];
			for(int j=0;j<s.length;j++) {
				
				System.out.println(s[j]+k[j]+" ");
			}
			
			System.out.println();
		}
			
	}
	

}
