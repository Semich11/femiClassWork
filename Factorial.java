
public class Factorial{
	public static void main(String[] args){

		System.out.println(factoria(10));
		System.out.println(reverse(612));


	}


		public static int factoria(int number){

			for(int factorial = number - 1; factorial >= 1; factorial-- ){
				number *= factorial;
			}

			return number;

		}







		public static int reverse(int number){
 			int reverses = 0;
			while (number > 0) {
				reverses = number % 10;
				number /= 10;				
			}

			//System.out.print(reverses)

			return reverses; 

		}







 		public static int minMax(){

		 	System.out.print("input score 1: ");
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
 		}


}
