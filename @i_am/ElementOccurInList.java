public class ElementOccurInList{

	public static void main(String[] args){

		int[] newList = {1, 2, 3, 4, 5};

		System.out.println(ElementOccurInListFunction(newList, 5));


	}

	public static String ElementOccurInListFunction(int[] newList, int target){


		boolean flag = false;

		for (int element : newList){
			if (element == target){
				flag = true;
				break;
			}

		}
		if (flag) return "" + flag;
		else return "false";

	}


}