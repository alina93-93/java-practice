package day_47_blocks;

public class VariableAccess {
	// instatnce veriable
	int myInstatceVar = 40;
	
	
	//static variable
	static int myStaticVar = 55;
	
	
	public static void main(String[] args) {
		// System.out.println(myInstanceVar); is not working because it is not static
		System.out.println(myStaticVar);
		
		//create obj of VAriable access and print value of myInstatnceVar
		
		VariableAccess v = new VariableAccess();
		System.out.println(v.myInstatceVar);
		System.out.println(v.myStaticVar);
		
		//access staitiv variable using classname
		System.out.println(VariableAccess.myStaticVar);
	}

}
