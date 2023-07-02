package palidromno;

public class pelidrome {
	
	public static void main(String[] args) {
		
		int no=121,r,s=0;
		
		int temp=no;
		
		
		while(no>0) {
			
			r=no%10;
			
			no=no/10;
			
			s=s*10+r;
			
			
			
		}
		
	if(temp==s) {
		System.out.println("No is palidrome");
	}
	else {
		System.out.println("not");
	}
		
		
	}

}
