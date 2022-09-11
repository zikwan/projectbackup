package objectorientedprograming;

public interface Interface_RBI {
	
		void withdraw();
		void deposite();
	
abstract class HDFC implements Interface_RBI{
		
		public void withdraw() {
		System.out.println("please withdraw");
		}
	}

class HDFCDeposite extends HDFC {
		
		public void deposite () {
		System.out.println("please deposite");
		}
	}
}