import java.util.Arrays;

public class LagestInArray{

	public static void main(String[] args){
		
		int[] femiArray = new int[] {1, 2, 3, 100, 5, 6, 7, 8, 9, 10};

		System.out.println(largestNumberInArray(femiArray));


	}


	public static int largestNumberInArray(int[] newArray){
		
		int highest = 0;
		for (int number : newArray){
			if (number > highest){
				highest = number;
			}
		}
		return highest;

	}

}