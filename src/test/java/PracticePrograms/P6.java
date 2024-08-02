package PracticePrograms;

public class P6 {
	
	public static void main(String[] args) {
				
		//rev
		
		int n =345;
		
		int i=0,j=0,a;
		
		a=n;
		
		
		while(a>0) {
			
			i=a%10;
			j= (j*10)+i;
			a=a/10;
		}
		System.out.println(j);
	}
}
