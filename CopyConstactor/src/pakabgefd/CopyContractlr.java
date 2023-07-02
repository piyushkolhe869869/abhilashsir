package pakabgefd;

public class CopyContractlr {

	int id;
	String name;
	public CopyContractlr(int id, String name) {
		
		
		this.id = id;
		this.name = name;
	}
	
	public CopyContractlr(CopyContractlr c) {
		id=c.id;
		name=c.name;
		
	}
	
	
	public static void main(String[] args) {
		
		CopyContractlr c1=new CopyContractlr(10,"piyush");
		
		CopyContractlr c2=new CopyContractlr(c1);
		
		System.out.println(c2.id);
		System.out.println(c2.name);
	}
	
}
