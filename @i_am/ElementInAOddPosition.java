import java.util.Arrays;

public class ElementInAOddPosition{

	public static void main(String[] args){

		int[] newList = {1, 2, 3, 4, 5};
		System.out.println(ElementInAOddPositionFunction(newList));



	}


	public static String ElementInAOddPositionFunction(int[] newList){

		String stringify = "";

		for (int element = 0; element <= newList.length - 1;  element++){
			if (element % 2 == 0){
			 	stringify += newList[element];
			}
		}
		return stringify;

	}


}