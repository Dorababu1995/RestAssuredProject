package BDD;

public class P2 {
	
	public static void main(String[] args) {
		
		

		String input = "Tomorrow6";
		

		
		StringBuilder result = new StringBuilder();
		
		
		int Ocount =0;
		
		
		for(char c : input.toCharArray()) {
			
			if(c=='o'|c=='O') {
				
				Ocount++;
				
				for(int i =0;i<Ocount;i++) {
					result.append("&");
				}
			}else {
				result.append(c);
			}
			
		}
		
		System.out.println(result.toString());
	
		
		
		
	}

}
