import java.util.Arrays;

public class Task08{

	public static void main(String[] args){

		int[] newList = {1, 2, 3, 4, 5};
		System.out.println(doWhileFunction(newList));



	}


	public static int forLoopFunction(int[] newList){

		int total = 0;

		for (int element = 0; element <= newList.length - 1;  element++){
			total += newList[element];
		}
		return total;

	}

	public static int whileLoopFunction(int[] newList){

		int total = 0;
 		int element = 0;

		while (element <= newList.length - 1){
			total += newList[element];
			element++;
		}
		return total;

	}

	public static int doWhileFunction(int[] newList){

		int total = 0;
 		int element = 0;

		do{
			total += newList[element];
			element++;
		}

		while (element <= newList.length - 1);
		return total;

	}


}