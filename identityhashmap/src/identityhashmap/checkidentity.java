package identityhashmap;

import java.util.IdentityHashMap;
import java.util.Map;

public class checkidentity {
	
	public static void main(String[] args) {
		
		Integer r=new Integer(5);
		
		Integer r1=new Integer(5);
		
		Map<Integer,String> m=new IdentityHashMap<>();
		  
		  m.put(r, "java");
		  m.put(r1, "c++");
		  
		  System.out.println(m);
	}

}
