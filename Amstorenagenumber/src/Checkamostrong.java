
public class Checkamostrong {
	
	public static void main(String[] args) {
		
		int no=153, r, sum=0;
		
		int temp=no;
		
		
		
		while(no>0) {
			
			r=no%10;
			
			no=no/10;
			
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Number is amstronge");
		}
		else {
			System.out.println("Not");
		}
	}

}
