
public class Factorial{
	public static void main(String[] args){

		System.out.println(factoria(10));
		System.out.println(reverse(12345));


	}


		public static int factoria(int number){

			for(int factorial = number - 1; factorial >= 1; factorial-- ){
				number *= factorial;
			}

			return number;

		}







		public static String reverse(int number){
 			String out = "";
 			int reverses = 0;
			while (number > 0) {
				reverses = number % 10;
				out += reverses;
				number /= 10;	

							
			}


			return out; 

		}




}
