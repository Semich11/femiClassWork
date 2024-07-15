import java.util.Scanner;

public class MinMax{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.printf("input score");
		int score = input.nextInt();

		int min = score;

		int max = score;

		for(int count = 1; count <= 10; count++){

			if (score > max){
				max = score;
			}else if(score < min){
				min = score;
			}
			if(count == 10) break;

			System.out.printf("input score");
			score = input.nextInt();

		}

		System.out.printf("minimum number: %d%nmaximum number: %d", min, max);

 	}


}
