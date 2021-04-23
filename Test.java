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
