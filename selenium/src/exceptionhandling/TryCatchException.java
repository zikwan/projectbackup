package exceptionhandling;

public class TryCatchException {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	
	try {
		// we will write code Which may generate exception or may not generate exception
		System.out.println("*****");
		int a =10/0;
		System.out.println("******");
		System.out.println("*******");
	}
	
	catch(Exception e) {
	//System.out.println("Exception generated");
	// we shoud write alterantine code.
		int a=10/2;
	//FileInputStream file = new FileInputStream("c://abc.xlxs");
	// System.out.println("some code in catch block");
	e.printStackTrace();
	}
	
	finally {
		System.out.println("Finally block");
		}
	System.out.println("6");
	System.out.println("7");
	System.out.println("8");
	System.out.println("9");
	}
}

