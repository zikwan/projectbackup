package objectorientedprograming;

abstract public class Abstraction_RBI {

	public static void main(String[] args) {
	}
	
abstract public void withdraw(); 
abstract public void deposite(); 
abstract public void investment();

	public void rules() {
	System.out.println("please implement services");
	}
}

abstract class HDFC extends Abstraction_RBI {
	
		public void withdraw () {
		System.out.println("please withdraw");
	}
		
	public void deposite() {
	System.out.println("please deposite");
	}
	
class HDFCinvestment extends HDFC{
		public void investment() {
		HDFCinvestment HI = new HDFCinvestment();
		System.out.println("please invest");
		}
	}
}