package day_39;

public class School {
	public static void main(String[] args) {
		
		//create obj from student class
		Student student = new Student();
		student.name = "Roman";
		student.age = 25;
		student.subject = "Java";
		
		System.out.println("Name: "+student.name);
		System.out.println("Age: "+student.age);
		System.out.println("Subject: "+student.subject);
		
		Student student2 = new Student();
		student2.name = "Olya";
		student2.age = 17;
		student2.subject = "SQL";
		
System.out.println();
		System.out.println("Name: "+student2.name);
		System.out.println("Age: "+student2.age);
		System.out.println("Subject: "+student2.subject);
		
		// System.out.println(student.name);
	}

}
