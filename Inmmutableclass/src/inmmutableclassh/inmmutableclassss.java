package inmmutableclassh;

public class inmmutableclassss {

	private  final int rollno;
	
	private final String name;
	
	public inmmutableclassss(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "inmmutableclassss [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
	
}
