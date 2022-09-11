package objectorientedprograming;

public class HierarichalInheritance {

	public static void main(String[] args) {
	
	}
	
	public void add(int a,int b) {
	
		int	 c = a+b;
		System.out.println(c);

	}
}
		 class Child1 extends HierarichalInheritance {
			 
			 public static void main(String[] args) {
				 
			 
			Child1 c1 = new Child1();
			c1.add(10, 20);
			
			 }
		}
	
		 class Child2 extends HierarichalInheritance {
			
		public static void main(String[] args) {
			 
				 Child2 c2 = new Child2();
				 c2.add(100,200);
				 
			 }
			 }
			
			
			
			
