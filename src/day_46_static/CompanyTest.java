package day_46_static;

public class CompanyTest {
	public static void main(String[] args) {
		
		// print cname (company name)
		
		System.out.println(Company.cname);
		System.out.println(Company.cname.toLowerCase());
		
		//the same output
		Company.cname.toLowerCase();
		System.out.println();
		
		Company c = new Company ();
		System.out.println(c.cname);
		
		c.cInfo();
		
		
	}

}
