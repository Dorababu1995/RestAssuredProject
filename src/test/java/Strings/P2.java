package Strings;

public class P2 {
	
	public static void main(String[] args) {
		//each word revs
		
		String input = "Software Enginer Dorababu";
		
		String[] split = input.split(" ");
		
		int l = split.length;
		String revString ="";
		for (String word : split) {
			
			String rev="";
			
			for(int i =word.length()-1;i>=0;i--) {
				
				rev = rev+word.charAt(i);
			}
			
			revString = revString +rev + " ";
		}
		System.out.println(revString);
	}

}
