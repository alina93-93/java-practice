package day_50;

public class Google extends SearchEngine{
	
	@Override
	public int search (String item) {
		System.out.println("Seracjing for "+item);
		int resultCount = item.length();
		return resultCount;
	}
	

}
