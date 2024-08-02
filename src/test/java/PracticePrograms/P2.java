package PracticePrograms;

public class P2 {
	
	public static void isPrime(int n) {
		int count =0;
		for(int i=2;i<=n/2;i++) {
			
			if(n%i==0) {
			count =1;
			}
			}
		
		if (count==0) {
			System.out.println("prime number");
		}else {
			System.out.println("not prime number");
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		isPrime(4);
	}

}
