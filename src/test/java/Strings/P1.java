package Strings;

public class P1 {
	
	public static void main(String[] args) {
		
		
		String input ="Dorababu";
		
		char[] charArray = input.toCharArray();
		
		String rev ="";
		
		for(int i =charArray.length-1;i>=0;i--) {
			
			rev = rev+input.charAt(i);
		}
		System.out.println(rev);
	}

}
