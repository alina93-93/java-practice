package day_15_string_manipulation;

public class GoogleSearchTest {
public static void main(String[] args) {
	
	String item = "java";
	String pageTitle = item + " - Google Search";
	
	//test if pageTitile trats with item then ..
	
	if (pageTitle.startsWith(item)) {
		System.out.println("Page title chack passed");
	}else {
		System.out.println("FAIL: Page title check failed");
	}
	
	if (pageTitle.endsWith("Google Search")) {
		System.out.println("PASS");
	} else {
		System.out.println("FAIL: ");
	}
	
	
	
	
}
}
