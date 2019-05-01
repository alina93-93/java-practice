package day_13_ternary_string_intro;

public class MoreTernary_Remainder {
	public static void main(String[] args) {
		
		String quality = "good";
		int rating = (quality.contentEquals("good"))? 2 : 0;
		System.out.println("Rating: "+rating);
			
		
		
		int PMHour = 6;
		/// rush hour durfing : 4-7
		
		boolean rushHour = (PMHour >= 4 && PMHour <=7 ) ? true : false; 
		//System.out.println(PMHour + " pm is rush hour?");
		
		String result = rushHour == true ? "yes" : "no";
		
		System.out.println(PMHour + " pm is rush hour?");
		
		
		
		
		int AMHour= 8; //6-9
		
		String amRushHour = AMHour >= 6 && AMHour <= 9 ? "yes" : "no";
		System.out.println(AMHour + " am is a rush hour? - "+ amRushHour );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
