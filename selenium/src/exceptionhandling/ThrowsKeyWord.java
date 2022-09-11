package exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsKeyWord {

	public static void main(String[] args) {
		
		try {
			readdata();
		
		}
catch(Exception e) {
	System.out.println("alternative exception handling code");
}
	
	System.out.println("program executed");
}
	
public static void readdata() throws FileNotFoundException {
	FileInputStream file = new FileInputStream("D://testData.txt"); 
}
	
}
