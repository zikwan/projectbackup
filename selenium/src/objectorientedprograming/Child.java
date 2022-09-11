package objectorientedprograming;

public class Child extends Parent{

	static int a=100;
	static int b =200;
	public static void main(String[] args) {
		
		// int c = a+b;
		// System.out.println(c);
		
		
		// Parent p = new Parent();
		Child ch= new Child();
		// Parent p1 = new Child();
		// Child c1 = new Parent();		Invalid case  
		
		ch.addition(a, b);
		ch.multiplication(a, b);
		System.out.println(ch.Username);
		System.out.println(ch.password);
	}
	
	public void multiplication(int x, int y) {
		int c = x*y;
		System.out.println(c);
	}
	
	
	
}
