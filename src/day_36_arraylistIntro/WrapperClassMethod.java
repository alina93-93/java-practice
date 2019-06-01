package day_36_arraylistIntro;

public class WrapperClassMethod {
	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println();
		
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		System.out.println();
		
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		System.out.println();
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		
		System.out.println();
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		System.out.println();
		
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println();
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE); // ￿
		
		System.out.println();
		
		int count = Integer.parseInt("345356");
		System.out.println("count: "+count);
		
		int count2 = Integer.parseInt("654738");
		System.out.println("count2: "+count2);
		
		System.out.println();
		
		System.out.println(Character.isAlphabetic('a'));
		System.out.println(Character.isAlphabetic('1'));
		System.out.println(Character.isAlphabetic('@'));
		
		System.out.println();
		
		System.out.println(Character.isLetter('j'));
		System.out.println(Character.isLetter('1'));
		System.out.println();
		
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('j'));
		
		System.out.println();
		
		String str = "java101";
		System.out.println(Character.isAlphabetic(str.charAt(0)));
		System.out.println(Character.isDigit(str.charAt(6)));
		
		String word = "ab123c5dfer1";
		
		for (int i = 0; i< word.length(); i++) {
			if (Character.isDigit(word.charAt(i))) {
				System.out.println(word.charAt(i));
			}
		}
		
	}

}
