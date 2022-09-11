package objectorientedprograming;

public class Encapsulation {
	
	Encapsulation(){
		System.out.println("This is super class");
	}

	private String username="speedway";
	private String password = "tech"; 
	
	public void getCred() {
		System.out.println("username is:"+username);
		System.out.println("password is:"+password);
	}
	public void setCred(String uname,String pwd) {
		username=uname;
		password=pwd;
		System.out.println("username is:"+username);
		System.out.println("password is:"+password);
	}
}



