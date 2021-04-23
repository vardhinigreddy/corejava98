package programs;

import java.util.Scanner;

class Rectangle{
	float length;
	float breadth;
	
	public Rectangle(float length,float breadth){
		this.length=length;
		this.breadth=breadth;
	}
	void area() {
		float area=length*breadth;
		System.out.println("area of the rectangle is "+area);	
	}
	void perimeter(float length,float breadth) {
		float perimeter=2*(length+breadth);
		System.out.println("Perimeter of the rectangle is "+perimeter);
	}
}
class Square extends Rectangle{
	float s;
	Square(float s) {
        super(s, s);
        this.s= s;
	}
	 void area()
	    {
	        double a = s*s;
	        System.out.println("Area of Square = " + a);
	    }
	 void perimeter()
	    {
	        double p = 4*s;
	        System.out.println("Perimeter of Square = " + p);
	    }  	
	}
public class inherit {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the length of the rectangle");
		float l=scan.nextFloat();
		System.out.println("enter the breadth of the rectangle");
		float b=scan.nextFloat();
		Rectangle r=new Rectangle(l,b);
		r.area();
		r.perimeter(l, b);
		
		System.out.println("enter the length of the square");
		float len=scan.nextFloat();
		Square s=new Square(len);
		s.perimeter();
		s.area();
	}

}
