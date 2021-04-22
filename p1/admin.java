package pentagon.p1;

public class admin {

	public static void main(String[] args) {
		
		umpire u = new umpire();
		System.out.println(u);
		int i = 0;
		for(i=0;i<=2;i++)
		{
			u.collectFromGuesser();
			u.collectFromPlayer();
			u.compare();
			
		}
	}

}


