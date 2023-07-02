import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Removeduplictlist {
	
	public static void main(String[] args) {
		
		List<Integer>li=new ArrayList<>();
		  
		  li.add(10);
		  li.add(10);
		  li.add(10);
		  li.add(89);
		  li.add(45);
		  li.add(78);
		  li.add(35);
		  li.add(25);
		  li.add(9);
		  li.add(9);
		  
		  Collections.sort(li);
		
		  
	List<Integer>	list  =li.stream().distinct().collect(Collectors.toList());
	  
	list.forEach(le->System.out.println(le));
	System.out.println("====================================================");
	
	
	
	
	//second way to 

	Set<Integer>si=new HashSet<>(list);
	  
	   li.addAll(si);
	   
	    Iterator<Integer> itr= si.iterator();
	    
	    while(itr.hasNext()) {
	    	 Integer in =itr.next();
	    	 System.out.println(in);
	    }
	  
	
	
	
	}
}
