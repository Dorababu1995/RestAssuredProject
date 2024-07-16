package BDD;

import org.testng.annotations.Test;

public class sample {

	
	public static void main(String[] args) {
		
		String input ="aBcA1bC2";
		
		StringBuilder  lowecase = new StringBuilder ();
		StringBuilder  uppercase = new StringBuilder ();
		StringBuilder  digit= new StringBuilder ();
		
		for (char c : input.toCharArray()) {
			
			if (Character.isLowerCase(c)) {
				
				lowecase.append(c);
			}else if(Character.isUpperCase(c)) {
				uppercase.append(c);
			}else if(Character.isDigit(c)) {
				digit.append(c);
			}
			
		}
		
		
		System.out.println(uppercase.toString()+" "+lowecase.toString()+" "+digit.toString());
		
		
		
	}
	
	
}
