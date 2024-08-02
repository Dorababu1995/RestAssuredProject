package Strings;

public class P10 {
	
	public static void main(String[] args) {
		
		String input = "aBACbcEDed";

		StringBuilder lowercase = new StringBuilder();
		StringBuilder uppercase = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		
		
		for (char c : charArray) {
			
			if(Character.isLowerCase(c)) {
				lowercase.append(c);
			}else {
				uppercase.append(c);
			}
			
		}
			
		
		System.out.println(lowercase.toString());
		System.out.println(uppercase.toString());
		
		
	}

}
