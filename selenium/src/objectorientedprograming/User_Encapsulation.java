package objectorientedprograming;

// Object is root class of all classes directly or indirectly 

class User_Encapsulation extends Encapsulation{
	
// JVM will create default or 0-args constructor and super keyword it will on first inside constructor	
	public static void main(String[] args) {
		User_Encapsulation use = new User_Encapsulation();
		use.getCred();
		use.setCred("abc", "xyz");
	}
	
}
