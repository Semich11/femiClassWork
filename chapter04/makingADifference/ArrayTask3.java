import java.util.Arrays;

public class ArrayTask3{
	public static void main(String[] args){

		int[] createArray = new int[] {-5,-4,3, 2, 1};

		int[] newArray = new int[createArray.length];

		for (int count = 0;  count <= createArray.length - 1 ; count++){
			newArray[count] = createArray[count] * createArray[count];
			
		}

		System.out.println(Arrays.toString(newArray));


		for (int count = 0; count <= newArray.length - 1; count++){
			
			for (int counter = 0; counter <= newArray.length - 1; counter++){

				if (newArray[count] <= newArray[counter]){

					int tempHolder = newArray[count];

					newArray[count] = newArray[counter];

					newArray[counter] = tempHolder;

				}
			}		

		}

		System.out.println(Arrays.toString(newArray));


		


	}
}