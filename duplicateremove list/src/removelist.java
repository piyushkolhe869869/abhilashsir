import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class removelist {
	
	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<>();
		
		list.add(10);
		list.add(10);
		list.add(25);
		list.add(15);
		list.add(19);
		list.add(14);
		list.add(10);
		list.add(9);
		list.add(9);
		
//	we remeve duplicate by twio way	
Collections.sort(list);
	
List li=list.stream().distinct().collect(Collectors.toList());
		
	
     System.out.println(li);
	   
		
		
		
		
		
		// we remove duplicate by to way
		
		
		Set<Integer> si=new HashSet<>(list);
	
		//  si.clear();
		  
		  list.addAll(si);
		  
		  System.out.println(si);
		
		for(Integer  s:si) {
			System.out.println(s);
		}
		
		
		 Iterator<Integer>  itr=si.iterator();
		 
		   while(itr.hasNext()) {
			  Integer lie = itr.next();
			  System.out.println(lie);
		   }
		
	}

}
