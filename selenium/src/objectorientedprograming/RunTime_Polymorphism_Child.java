package objectorientedprograming;

public class RunTime_Polymorphism_Child extends RunTime_Polymorphism_Parent {

	static int a=100;
	static int b =200;
	
	public static void main(String[] args) {
		
		RunTime_Polymorphism_Child c = new RunTime_Polymorphism_Child();
		// child c1 = new Parent(); invalid 
		c.addition("Runtime Polymorphism");
		
	}
// overriding
	public void addition(String b) {
		System.out.println(b);
	}
}
