package pentagon.p1;

import java.util.Scanner;

public class Guesser {

	int gnum;
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("guesser guess the number");
		gnum = scan.nextInt();
		return gnum;
		
	}
}
