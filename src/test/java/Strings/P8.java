package Strings;

public class P8 {
	
	public static void main(String[] args) {
		//double char
		
		String input ="dorababu";
		
		StringBuilder sb = new  StringBuilder();
		
		for(int i =0;i<sb.length();i++) {
			
			sb.append(input.charAt(i)).append(input.charAt(i));
		}
		
	
		System.out.println(sb.toString());
		
	}

}
