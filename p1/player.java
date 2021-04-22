package pentagon.p1;

import java.util.Scanner;

public class player {

	int pnum;
	
	int guessNum()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("player guess the number");
		pnum = scan.nextInt();
		return pnum;
	}
}
