package exceptionhandling;

public class ThrowKeyword {
	
	public static void main(String[] args) throws PowerCutException {
		automationSession();
	}

	public static void automationSession() throws PowerCutException {
		
		boolean poweroff = true;
		
		if (poweroff==true) {
			
			throw new PowerCutException("session interuped due to power cut");
		
		}
		else {
			System.out.println("session is running");
		}
	}
}
	class PowerCutException extends Exception{
		PowerCutException(String msg){
			super(msg);
		}
	}

