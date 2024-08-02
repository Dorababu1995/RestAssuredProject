package PracticePrograms;

import java.util.Scanner;

public class P5 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count =1;
		
		for(int i=1;i<=n;i++) {
			
			count = count*i;
		}
		
		System.out.println(count);
	}

}
