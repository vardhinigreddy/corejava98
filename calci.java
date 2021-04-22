package programs;

import java.util.Scanner;

public class calci {
	static float a,b;
	static int op;
	public static void main(String[] args) {
		System.out.println("welcome to perform mathematical operations"); 
	    fun();
	}	
		public static  void fun() {	
			Scanner scan =new Scanner(System.in);
			try {
			System.out.println("enter the first number");
		    a=scan.nextFloat(); 
			System.out.println("enter the second number");
		    b=scan.nextFloat();
			System.out.println("enter the operation to be performed");
			System.out.println("enter the number 1-add or 2-sub or 3-multiplication and 4-division");
		    op=scan.nextInt();
			}
			catch(Exception e) {
				System.out.println(e+" input should be in numbers");
			}	
		switch(op) {	
	   case 1:
		   System.out.println("Addition");
			float c=a+b;
			System.out.println("addition of"+a+" and "+b+"is"+c);
			f2();
			break;		
	  case 2:
		  System.out.println("substraction");
		float s=a-b;
		System.out.println("substraction of"+ a+" and "+b +"is "+s);
		f2();
		break;	
	 case 3:
		System.out.println("multiplication");
		float m=a+b;
		System.out.println("multiplication of"+ a+" and "+b +"is "+m);
		f2();
		break;	
	 case 4:
		System.out.println("division");
		try {
		float d=a/b;
		System.out.println("division of"+ a+" and "+b +"is "+d);
		f2();
		break;
		}
		catch(ArithmeticException ae) { 
			System.out.println("cannot be divide by zero");
		}
	 default:
			System.out.println("enter valid number between in the range of 1-4");
	}
}
	public static void f2() {
		Scanner scan=new Scanner(System.in);
			System.out.println("enter 1 to continue and 0 to stop the process");
			int cont=scan.nextInt();
			if(cont==1) {
				fun();
			}
			else{
				System.out.println("thank you for successfully completing the matheamtical operation");
				System.exit(0);
			}
			scan.close();
	  }
}	
		
	


