package pdf;

public class P1 {
	
	public static void main(String[] args) {
	
		
		int arr[] = {0,0,2,3,3,4,4,8,9};
		
		int j=1;
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]!=arr[i+1]) {
				
				arr[j]=arr[i+1];
				j++;
				
			}
		}
		
		for(int k=0;k<j;k++) {
			System.out.println(arr[k]);
		}
	}

}
