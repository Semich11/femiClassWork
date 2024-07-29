import java.util.Arrays;

public class StringPalindrome{

	public static void main(String[] args){
		String newList = "poP";

		System.out.println(StringPalindromeFunction(newList));




	}

	public static String StringPalindromeFunction(String newList){

		String stringlify = "";

		for (int count = 1; count <= newList.length(); count++){
			char singelChar = newList.charAt(newList.length() - count);
			stringlify += singelChar;
		}

		if (newList.equalsIgnoreCase(stringlify)) return "True";
		else return "False";

	}



}