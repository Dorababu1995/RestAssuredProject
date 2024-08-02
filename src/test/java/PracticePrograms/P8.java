package PracticePrograms;

import java.util.Scanner;

public class P8 {
	
	public static void main(String[] args) {
		//calculate sum of digits
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i =0,j=0,a;
		a=n;
		while(a>0) {
			i =a%10;
			j =j+i;
			a=a/10;
		}
		System.out.println(j);
		
	}

}
