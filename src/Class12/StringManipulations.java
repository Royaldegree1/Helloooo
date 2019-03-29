package Class12;

public class StringManipulations {

	public static void main(String[] args) {
		//Length function/ or method - returns number of character in the String
		
		String str="Syntax";
		
		int lengthOfString=str.length();
		System.out.println(lengthOfString);
		
		String str1="Syntax Technologies";
		
		int lengthOf2String=str1.length();
		System.out.println(lengthOf2String);
		
		String str2="Welcome, students!";
		System.out.println(str2.length());
		//toUpperCase-> convert all character to UpperCase
		//toLowerCase()-> convert all character to LowerCase
		
		String str3="Hello";
		
		String newString=str3.toUpperCase();
		System.out.println(newString);
		
		String lowerCaseString=newString.toLowerCase();
		System.out.println(lowerCaseString);
		
		//comparing string use ".equals" if strings are equal-> true, else -> false
		String str4="Hello";//upper
		String str5="hello";//lower
		
		boolean equality=str4.contentEquals(str5);
		System.out.println(equality);
		//equalsIgnoreCase() - compares 2 strings but ignores case
		String expectedBrowser="Chrome";
		String actualBrowser="ChroMe";
		
		boolean equals=expectedBrowser.equalsIgnoreCase(actualBrowser);
		System.out.println(equals);
		
		
		
		
		
	}

}
