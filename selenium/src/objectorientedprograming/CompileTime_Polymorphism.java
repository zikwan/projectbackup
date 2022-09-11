package objectorientedprograming;

public class CompileTime_Polymorphism {
	// Compile time polymorphism
	// constructor overloading
	
	// java does not support operator overloading concept 
	
	CompileTime_Polymorphism(){
	
	}
	CompileTime_Polymorphism(int a){
		
	}
	CompileTime_Polymorphism(String b){
		
	}
	
	// method overloading
	public static void main(String[] args) {
		CompileTime_Polymorphism poly = new CompileTime_Polymorphism();
		poly.explicitwait();
		poly.explicitwait(20);

		System.out.println(10+20);
		System.out.println("method"+10+"overloading");
		
	}
	
	public void explicitwait(){
		System.out.println("10 seconds"); 
		}

		public void explicitwait (int a){
		System.out.println("20 seconds");
		}
		
		public void explicitwait (int a,int b){
			System.out.println("20 seconds");
			}
		
		public void explicitwait (String a,int b){
			System.out.println("20 seconds");
			}
		
		/* the class should contains more than one method with the same name 
		 * with different datatypes or parameters lists;
		 * 
		 *  1) number of args
		 *  2) sequence of args
		 *  3) types of args
		 */

}
