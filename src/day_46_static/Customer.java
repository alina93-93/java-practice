package day_46_static;

public class Customer {
	
	private String name;
	private String email;
	
	static int count; //shared by everyone // all objects
	                  // one central copy of this variable
	
	
	public  Customer () {
		this.name = "underfined";
		this.email = "underfined";
		count++;
	}
	
	public  Customer (String name, String email) {
		 this.name =name;
		  this.setEmail(email);
	     count++;
	}
		
	@Override
	public String toString() {
		return "Customer [name = " + name + ",email = " + email + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
