package day_31;

public class ShareThisOne {
public static void main(String[] args) {
	
	login ("mentoring@cybertekschool.com","mentor001");
	
	
	
	
}

public static void login (String userName, String password) {
	
	String  validUsername = "mentoring@cybertekschool.com";
	 String validPassword = "mentor001";
	if (userName.equalsIgnoreCase(validUsername)&& password.equals(validPassword)) {
		System.out.println("Login successful");
	}else {
		System.out.println("Sign in failed");
	}
}



}
