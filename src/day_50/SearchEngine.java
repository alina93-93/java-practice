package day_50;

public class SearchEngine {
public int search (String item) {
	System.out.println("Seracjing for "+item);
	int resultCount = item.length();
	return resultCount;
}

	public void search (String item, String item2) {
		System.out.println("Searching for 2 items: " +item+ ", "+item2);
		int resultCount = item.length()+item2.length();
		System.out.println("Total count: "+resultCount);
		
	}
	
	String clickResult() {
		System.out.println("Clicking result");
		return "Serch result page";
	}
}
