package day27_arrays05;

public class Tools {
public static void main(String[] args) {
	
	String[] tools = {"Java","Selenium","TestNG","JUnit","Cucumber","Git","Maven"};

	for ( String tool : tools) {
		switch (tool) {
		case "Java":
			System.out.println("Java --> programming language");
			break;
		case "Salenium" :
			System.out.println("Selenium --> Test Automation");
			break;
		case "TestING":
			System.out.println("TestNG --> Unit Tests");
			break;
		case "JUnit":
			System.out.println("JUnit --> Unit Tests");
		break;
		case "Cucumber":
			System.out.println("Cucumber --> BDD Style testing");
			break;
		case "Git":
			System.out.println("Git --> Version control");
			break;
		case "Maven":
			System.out.println("Maven --> Building and execution for project ");
			break;

		   default:
			   System.out.println("Unknown tool");
	
		}
	}
	
	
	
}
}
