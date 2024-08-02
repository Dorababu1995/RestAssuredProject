package Strings;

public class P6 {
	public static void main(String[] args) {
	//	unique
		
		String input = "Dorababu";
		
		boolean[] unique = new boolean[128];		
		
		for(int i =0;i<input.length();i++) {
			
			char c = input.charAt(i);
			
			if(!unique[c]) {
				unique[c]=true;
				System.out.println(c+" ");
			}
			
		}
		
		
		
		
	}

}
