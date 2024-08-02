package PracticePrograms;

public class P7 {
	
	public static void main(String[] args) {
		//armstrong number 123
		
		int n =1634;
		
		int i =0,j=0,a;
		a=n;
		while(a>0) {
			
			i=a%10;
			j = j+(i*i*i);
			a=a/10;
			
		}
		if(j==a) {
			System.out.println("armstrong number");
		}
		
	}

}
