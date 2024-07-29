import java.util.Arrays;

public class RunningTotalOfAList{

	public static void main(String[] args){

		int[] newList = {1, 2, 3, 4, 5};
		System.out.println(ElementInAOddPositionFunction(newList));



	}


	public static int ElementInAOddPositionFunction(int[] newList){

		int total = 0;

		for (int element = 0; element <= newList.length - 1;  element++){
			total += newList[element];
		}
		return total;

	}


}