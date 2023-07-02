package inmmutableclassh;

public class inmmutable2 {
	
	private final int id;
	
	private final String address;
	
	public inmmutable2(int id,String address) {
		
		this.id=id;
		this.address=address;
		
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "inmmutable2 [id=" + id + ", address=" + address + "]";
	}
	
	
	
	

}
