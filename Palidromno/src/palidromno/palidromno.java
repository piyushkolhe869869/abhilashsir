package palidromno;

public class palidromno {
	
	public static void main(String[] args) {
		
		int no=121,rem,rev=0;
	
		int temp=no;
		
		while(temp!=0) {
			
			rem=temp%10;
			
			rev=rev*10+rem;
			
			temp=temp/10;
			
		}
		
		if(no==rev) {
			System.out.println(no+"=is a palidrom no");
		}
		else {
			System.out.println("Not palidrom no");
		}
	}

}
