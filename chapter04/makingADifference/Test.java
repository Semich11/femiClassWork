
import java.util.Scanner;

public class Test{

	public static void main(String[] args){
		//System.out.println(encryptData(1234));
		/*System.out.println("hhhhh");
		Scanner input = new Scanner(System.in);
		System.out.println("hhhhh");
		int userInput = input.nextInt(); 
		System.out.println(userInput);

		String hold = "";
		hold += userInput;
		System.out.println(hold);*/

		
 		System.out.println(encryptData(0419L));

		

	}   





		public static int encryptData(int fourDigit){

		String letter = "";
		String reverseLetter = "";

		int encryptedData = 0;
		int reverseEncryptedData = 0;




		while (fourDigit > 0){

			int singleDigit = fourDigit % 10;
			singleDigit += 7;
			singleDigit %= 10;
			letter += singleDigit;
		
			fourDigit /= 10;

		}
		encryptedData = Integer.parseInt(letter);

 	 	return encryptedData;
 		}

}