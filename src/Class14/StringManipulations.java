package Class14;

public class StringManipulations { //replacing

	public static void main(String[] args) {
		// 1 replace()
		
		String str="I am a good tester!";
		String newStr=str.replace("a", "e");
		System.out.println(newStr);
		
		String newStr1=str.replace("good", "great");
		System.out.println(newStr1);
		
		String newStr2=str.replace("tester",  "programmer");
		System.out.println(newStr2);
		
		String newStr3=str.replace("!", "?");
		System.out.println(newStr3);
		
		
		//2
		//INTERVIEW Calculate how many characters you have in string
		
		String str1="123Hello 456 World 789#$";
		String replacedNoNumbers=str1.replaceAll("[0-9]", "");
		System.out.println(replacedNoNumbers);
		
		String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
		System.out.println(newString);
		
//		String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-za-z]", "");
//		System.out.println(replacedNoCharacter);
		
		String str2="1Hello123";
		
		System.out.println(str2.replaceAll("[^0-9]",  ""));
		

	}

}
