package pelidromeno;

public class checkpelidrome {
	
	public static void main(String[] args) {
		
		int n=121,r,s=0;
		
		int temp=n;
		
		while(n>0) {
			
			r=n%10;
			
			n=n/10;
			
			s=s*10+r;
			
		}
		if(temp==s) {
			System.out.println("no is palidrome");
		}
		else {
			System.out.println("Not Palidrome");
		}
	}

}
