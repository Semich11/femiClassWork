
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class CryptographyPrivacyTest{
																			
	@Test
	public void testThatDataSentIsEncrypted(){

		CryptographyPrivacy CryptographyPrivacyMethods = new CryptographyPrivacy();

		String result = CryptographyPrivacyMethods.encryptData(1234);
		//String result = CryptographyPrivacyMethods.encryptData(0149);
		

		//assertEquals("8761", result);
		assertEquals("0189", result);



	}




}