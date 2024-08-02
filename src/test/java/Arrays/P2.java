package Arrays;

public class P2 {
	
	public static void main(String[] args) {
		
		int[] arr = {2,343,3,56,78,90};
		
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j =i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		int max;
		int min;
		for (int i : arr) {
			
			System.out.println(i);
			
			
		}
		System.out.println("max number"+arr[arr.length-1]);
		System.out.println("min number"+arr[0]);
		
	}

}
