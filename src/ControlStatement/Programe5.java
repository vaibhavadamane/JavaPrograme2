package ControlStatement;

public class Programe5 {
//WAP for ATM Machine Process (Nested If)
	public static void main(String[] args) {
    String pin= "1234";
    double amountAvilable = 10000;
    double amountWithdraw = 5000;
		
		if(pin == "1234")
		{
			System.out.println("Your pin is correct");
		
			if(amountWithdraw <= amountAvilable)
			{
				System.out.println("Please collect the cash");
			}
			else 
			{
				System.out.println("Insfficent amount");
			}
		}
			else
			{
				System.out.println("Incorrect password");
			}
			
		}
	}
		





