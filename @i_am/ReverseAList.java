import java.util.Arrays;

public class ReverseAList{

	public static void main(String[] args){
		int[] newList = new int[] {1,2,3,4};


		System.out.println(reverseAListMethod(newList));


	}

	public static String reverseAListMethod(int[] newList){

		int[] reverseList = new int[newList.length];
		for (int count = 0; count <= newList.length - 1; count++){
			reverseList[count] = newList[newList.length - count - 1];
		}
		return Arrays.toString(reverseList);	

	}


}