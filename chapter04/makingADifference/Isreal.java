public class Isreal{

	public static void main(String[] args){
		System.out.println("Isreal!!!");
/*
		int i = 0;
		int o = 2;
		int p = 4;

		int temp = i;
		i = p;
		p = temp;

		System.out.println(i+""+o+""+p);
*/

		String num = 1234;
		String first;
		String second;
		String third;
		String fourth;
		String count = 0;
			while(num > 0){
				int palin = num % 10;
				if (count == 0)
				first = String.valueOf((palin + 7) %10);
				if(count == 1)
				second = String.valueOf((pali + 7) % 10);
				if(count == 2)
				third = String.valueOf((pali + 7) % 10);
				if(count == 3)
				fourth = String.valueOf((pali + 7) % 10);
				count++;
				num/=10;
		}

		String cont = first + second + third + fourth;
		System.out.println(cont);		

	}

}