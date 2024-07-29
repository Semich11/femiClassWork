import java.util.Arrays;

public class Combine2List{

	public static void main(String[] args){

		String[] listA = {"a", "b", "c"};
		int[] listB = {1, 2, 3, 4, 5};


		System.out.println(ElementInAOddPositionFunction(listA, listB));



	}


	public static String ElementInAOddPositionFunction(String[] listA, int[] listB){

		String concat = "";

		for (int element = 0; element <= listA.length - 1;  element++){
			concat += listA[element];
			concat += listB[element];

		}

		/*for (int element = 0; element <= listA.length - 1;  element++){
			concat += listB[element];
		}*/
		return concat;

	}



}