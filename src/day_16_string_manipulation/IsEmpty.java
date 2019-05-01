package day_16_string_manipulation;

public class IsEmpty {
	public static void main(String[] args) {

		String userName = "";
		String password = "";
		System.out.println(userName.isEmpty());

		if (userName.isEmpty()) {
			System.out.println("User name failed cant be empty");
		} else {
			System.out.println("Username is empty");
		}
		if (userName.isEmpty() || password.isEmpty()) {
			System.out.println("Username or password is cannot be empty ");
			
		}else {
			System.out.println("Username or password is empty");
		}
		
		if (userName.length()==0) {
			System.out.println("Username length is 0 , so it is empty");
		}

	}
}
