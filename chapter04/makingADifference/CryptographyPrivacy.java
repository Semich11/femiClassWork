
import java.util.Scanner;

public class CryptographyPrivacy{


	public String encryptData(int fourDigit){

		

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

			//encryptedData = Integer.parseInt(letter);
		}

		encryptedData = Integer.parseInt(letter);


 		int firstDigit = 0;
 		int secondDigit = 0;
 		int thirdDigit = 0;
 		int fourthDigit = 0;

		int count = 0;

		while (encryptedData > 0){
 			count += 1;

			int singleDigit = encryptedData % 10;

			reverseLetter += singleDigit;

 		 	if (count == 1) firstDigit = singleDigit;
 		 	if (count == 2) secondDigit = singleDigit;
 			if (count == 3) thirdDigit = singleDigit;
 			if (count == 4) fourthDigit = singleDigit;
		
			encryptedData /= 10;

		}

		reverseEncryptedData = Integer.parseInt(reverseLetter);




 		String holder = "";

 		int tempHolder1 = firstDigit;
 		
		firstDigit = thirdDigit;
 		thirdDigit = tempHolder1;


 		int tempHolder2 = secondDigit;
 		secondDigit = fourthDigit;
 		fourthDigit = tempHolder2;


	 	holder += firstDigit;
	 	holder += secondDigit;
	 	holder += thirdDigit;
	 	holder += fourthDigit;


		int swapedEncryptedData = Integer.parseInt(holder);





		//return reverseEncryptedData;
		return holder;
 		//return encryptedData;

	}

}