package ControlStatement;

public class Programe4 {

	// FB login process (Nested If)
	
	public static void main(String[] args) {
		
	 String fbUsername ="Vaibhav@gmail.com";
	 String fbPassword ="Vaibhav@1997";
	 
	 if(fbUsername == "Vaibhav@gmail.com")
	 { 
		 System.out.println("Correct username");
		 
	 if(fbPassword == "Vaibhav@1997")
	 {
		 System.out.println("Login sucessful,welcome to fb");
	 }
	 else 
	 {
		 System.out.println("Incorrect password");
	 }
	 }
	 else 
	 {
		 System.out.println("Incorrect Username");
	 }
	 }
	}


