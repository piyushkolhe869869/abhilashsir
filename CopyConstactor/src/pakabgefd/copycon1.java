package pakabgefd;

public class copycon1 {
	
  int id;
  String name;
  
  public copycon1(int id,String name) {
	  
	  this.id=id;
	  this.name=name;
	  
  }
  
  
  public copycon1(copycon1 co) {
	 id=co.id;
	 name=co.name;
  }

  
  public static void main(String[] args) {
	
	  copycon1 con= new copycon1(10,"sms");
	  
	  copycon1 con1=new copycon1(con);
	  
	  System.out.println(con1.id+""+con1.name);
	 System.out.println(con.id+""+con.name);
}
  
  
}
