import java.util.Arrays;

public class ListOfDigits{

	public static void main(String[] args){

		int number = 2342;

          String result = Arrays.toString(ElementInAOddPositionFunction(number));
		System.out.println(result);



	}


	public static int[] ElementInAOddPositionFunction(int num){

		String concat = "";

		int count = 0;
 		int modu = len(num);
 		int countLimit = modu;
		int[] newArray = new int[4];

		while (num > 0){
 			if(count > countLimit)
			break	;
 			int raisePow = raiseToPower(10, modu);
 			if (count == 3)
 			raisePow = 1;

    			newArray[count] = num / raisePow;

			num %= raisePow;
 			modu -= 1;

 			
			count++;

		}

 		

		return newArray;

	}

	public static int len(int num){

		String concat = "";
		int count = 0;

		while (num > 0){
			concat += num % 10;
			count += 1;
			num /= 10;

		}

		return count - 1;

	}


	public static int raiseToPower(int num, int expo){

		int holder = num;
		while (expo > 1){
			holder *= num;
    			expo -= 1;

		}

		return holder;

	}





}