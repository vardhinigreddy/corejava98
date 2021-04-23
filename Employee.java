package programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 String name[]= {"robert","sam","john"};
		 int year[]= {1998,1994,1992,1990}; 
		 double sal[]= {10000,15000,20000};
		 String addr[]= {"64C-WalssStreat","67D-Wallsstraet","24R-Wallsstrea"};
		 
		/* for dynamic input
		 * String name[]=new String[3];
		 * int year[]=new int[3];
		 * double sal[]=new double[3];
		 * String addr[]=new String[3];
		 * 
		 * try {
		 for(int i=0;i<3;i++) {
			System.out.println("enter the name of employee "+(i+1));
			name[i]=scan.next();
			System.out.println("enter the year of joining of employee "+(i+1));
			year[i]=scan.nextInt();
			System.out.println("enter the salary of employee "+(i+1));
			sal[i]=scan.nextDouble();
			System.out.println("enter the addr of employee "+(i+1));
			addr[i]=scan.next();
		 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }*/
		 System.out.println("Name\tYearOfJoining\tSalary\t\tAddress");
		 for(int j=0;j<3;j++) {
			 System.out.println(name[j]+"\t"+year[j]+"\t\t"+sal[j]+"\t\t"+addr[j]);
		 }			 
	}
}
