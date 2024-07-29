import java.util.Scanner;
import java.util.Arrays;

public class ArrayPratice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int score = "scores" + 1;


		int[] score = new int[10];

		for(int count = 0; count < 10; count++){
			System.out.printf("input score %d%n", count);
			score[count] = input.nextInt();
		}

		System.out.println(Arrays.toString(score));


		/*System.out.print("input score 1: ");
		int score1 = input.nextInt();

		System.out.print("input score 2: ");
		int score2 = input.nextInt();

		System.out.print("input score 3: ");
		int score3 = input.nextInt();

		System.out.print("input score 4: ");
		int score4 = input.nextInt();

		System.out.print("input score 5: ");
		int score5 = input.nextInt();

		System.out.print("input score 6: ");
		int score6 = input.nextInt();

		System.out.print("input score 7: ");
		int score7 = input.nextInt();

		System.out.print("input score 8:");
		int score8 = input.nextInt();

		System.out.print("input score 9:");
		int score9 = input.nextInt();

		System.out.print("input score 10: ");
		int score10 = input.nextInt();

 		if(score1 % 2 == 0){
			System.out.print(score1 + " ");
 		}

 		if(score2 % 2 == 0){
			System.out.print(score2 + " ");
 		}

 		if(score3 % 2 == 0){
			System.out.print(score3 + " ");
 		}

 		if(score4 % 2 == 0){
			System.out.print(score4 + " ");
 		}

 		if(score5 % 2 == 0){
			System.out.print(score5 + " ");
 		}

 		if(score6 % 2 == 0){
			System.out.print(score6 + " ");
 		}

 		if(score7 % 2 == 0){
			System.out.print(score7 + " ");
 		}

 		if(score8 % 2 == 0){
			System.out.print(score8 + " ");
 		}

 		if(score9 % 2 == 0){
			System.out.print(score9 + " ");
 		}

 		if(score10 % 2 == 0){
			System.out.print(score10 + " ");
 		}*/

		/*System.out.printf("%d %d %d %d %d %d %d %d %d %d ", score1, score2, score3, score4, score5, score6, score7, score8, score9, score10);
*/






		
	}
}