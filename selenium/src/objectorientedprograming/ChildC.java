package objectorientedprograming;

public class ChildC extends Child{

	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		ChildC cc = new ChildC();
		
		cc.multiplication(i, j);
		cc.addition(i, j);
		
	}
	public void divide(int a, int b) {
	
		int c = a/b;
			System.out.println(c);
	}
}	

	


