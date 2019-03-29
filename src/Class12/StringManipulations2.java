package Class12;

public class StringManipulations2 {

	public static void main(String[] args) {
		// contains()-> checks for specific value in the string
		// if value is present-> true, else -> false

		String str="Good morning, students!";
		boolean contains=str.contains("Morning");
		System.out.println(contains);
		
		
		String present="Welcome, Asel";
		String neededValue="Welcome";
		
		boolean flag=present.contains("Welcome, "); //(neededValue) doesnt matter names, just if true or false
		System.out.println(flag);
		
		//startsWith(), endsWith(), -> will return true if String starts/ends with specific
		//else-> false
		boolean flag1=present.toLowerCase().contains(neededValue);//Lower or Upper changes true or false
		System.out.println(flag1);
		//
		System.out.println("______StartsWith & EndsWith________");
		String str1="syntax";
		
		boolean starts=str1.startsWith("s");
		System.out.println(starts);
		
		System.out.println(str1.endsWith("y"));
		
		//isEmpty() if length of a string is =0 -> string is empty else -> it is not 
		System.out.println("_________isEmpty()_____________");
		String str2="Hello";
		boolean isEmpty=str2.isEmpty();
		System.out.println(isEmpty);
		
		//
		String str3="Hello ";
		String str4="Ali! ";
		
		System.out.println(str3+str4);
		
		//System.out.println("__________--____________")
		String expected="You may qualify for a multi-policy discount!";
		String actual=" You may qualify for a multi-policy discount! ";
		
		//System.out.println(expected.contentEquals(actual));
		
		actual=actual.trim(); //spaces before or after sentence (true expected=actual is false)
		System.out.println(expected.contentEquals(actual));
		
		
		
		
	}

}
