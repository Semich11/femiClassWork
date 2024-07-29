import java.util.Scanner;

public class RaiseToPower{
	public static void main(String[] args){

		System.out.print(RaiseToPowerMethod(2,3));

 	}

	public static int RaiseToPowerMethod(int base, int power){
 		int baseHolder = base;

		while(power > 1){
			baseHolder = baseHolder * base;
			power--;
		}

		return baseHolder;

	}


}
