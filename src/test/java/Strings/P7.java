package Strings;

public class P7 {
	
	public static void main(String[] args) {
		// remove space
		
		String input = "Dorababu Autoamtion Enginer";
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0;i<input.length();i++) {
			
			if(input.charAt(i)!=' ') {
				sb.append(input.charAt(i));
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

}
