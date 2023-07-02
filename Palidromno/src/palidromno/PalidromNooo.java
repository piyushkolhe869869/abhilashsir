package palidromno;

public class PalidromNooo {
	
	public static void main(String[] args) {
		
		int no=505,rem,rev=0;
		
		 int temp=no;
		 
		 while(temp!=0) {
			 
			 rem=temp%10;
			 
			 rev=rev*10+rem;
			 
			 temp=temp/	10;
			 
		 }
		 
		if(no==rev) {
			System.out.println(no+"=No Is Palidraom No");
		}
		else {
			System.out.println("No Is Not Palidraom");
		}
		
	}

}
