/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
 1 - method of parent class by object of parent class
 2 - method of child class by object of child class
 3 - method of parent class by object of child class*/
package programs;
class Demo{
	
	public void fun(){
		System.out.println("this is parent class");
	}
}
class Demo1 extends Demo{

	public void fun1() {
		System.out.println("this is child class");
	}
}

public class Test {
	
	public static void main(String[] args) {
		Demo d=new Demo();
		Demo1 d1=new Demo1();
		d.fun();
		d1.fun1();
		d1.fun();
	}
}
