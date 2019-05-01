package day08_casting_conditionals;

public class IfElseWithVariables {
	
	public static void main(String[] args) {
	
		int temperature = 45;
			
	 temperature = 65;
	if (temperature >= 65){
	
		System.out.println("it is a nice day ? Lets code java");
	}else{	
		
		System.out.println("Stay home and code java");
		
	}	

	
	// 2 int variables, teamAScore, teamBScore
	// put a condition. check is teamA won
	//"Team A won".
	//Go to Team A!
	//else "teamB won or it was a draw"
	//Go Teama!
	
	int teamAScore = 5;
	int teamBScore = 9;
	
	if (teamAScore > teamBScore) {
		System.out.println("Team A Won!");
		
	System.out.println("Go Team A!");
	
	}else { 
		System.out.println("Team B won or it was a draw");
		System.out.println("Go Teams!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
			
}	
}	
	

