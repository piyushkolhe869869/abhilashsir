package exceptionunreched;

public class Unreached {
	
	public static void main(String[] args) {
		
		try {	
		int i=Integer.parseInt("abv");
		System.out.println(i);
		}
		catch (Exception e) {
			int i=Integer.parseInt("12655");
			System.out.println(i);
		}
		//catch (NumberFormatException e) {
			// TODO: handle exception
		//}
	}
	

}
