package day_30_Methods;

public class StudentAtSchool {
	public static void main(String[] args) {
		srudy ("HTML");
		srudy ("sql");
		sleep (3);
	}
	
	
	public static void srudy (String topic) {
		//topic = "sales";
		System.out.println("Student is studing "+topic);
		
	}

	public static void  sleep (int hours) {
		System.out.println("Student has been sleeping for "+hours+" hours");
	}
	
}
