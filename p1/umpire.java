package pentagon.p1;

public class umpire {

	int guessNum;
	int player1Number;
	int player2Number;
	int player3Number;
	
	void collectFromGuesser()
	{
		Guesser g = new Guesser();
		guessNum = g.guessNum();
				
	}
	
	void collectFromPlayer()
	{
		player p1 = new player();
		player p2 = new player();
		player p3 = new player();
		
		player1Number = p1.guessNum();
		player2Number = p2.guessNum();
		player3Number = p3.guessNum();
	}
	
	void compare()
	{
		if(guessNum == player1Number)
		{
			System.out.println("player1 wins the game");
		}
		else if(guessNum == player2Number)
		{
			System.out.println("player2 wins the game");
		}
		else if(guessNum == player3Number)
		{
			System.out.println("player3 wins the game");
		}
		else
		{
			System.out.println("match lost");
		}
		
	}
			
}

