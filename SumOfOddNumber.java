import java.util.Scanner;

public class SumOfOddNumber{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);


		int sum = 0;
		int oddSum = 0;


		for(int count = 1; count <= 10; count++){

			System.out.printf("input score");
			int number = input.nextInt();

			if (number / 2 > 0){
				oddSum += number;
			}
			sum += number;



		}

		System.out.printf("sum: %d%nodd number sum: %d", sum, oddSum);

 	}


}
