package PracticePrograms;

import java.util.Scanner;

public class P1 {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		if (n%2==0) {
			
			System.out.println("Given number is even number");
		}
		else if(n%2==1) {
			
			System.out.println("Given number is odd number");
		}
		
		
	}

}
