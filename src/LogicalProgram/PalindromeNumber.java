package LogicalProgram;

public class PalindromeNumber 
{
public static void main(String[] args) 
{
// a number (such as 16461) that remains the same when its digits are reversed is called as PalindromeNumber
	
	int num = 1001;
	String strNum = Integer.toString(num);//we convert the Int into String
	String strNum1 = "";
	char num1;
	
	for(int i=strNum.length()-1;i>=0;i--)
	{
		num1 = strNum.charAt(i);
		strNum1 = strNum1 + num1;
	}
	System.out.println(strNum1);
	
	if(strNum.equals(strNum))
	{
		System.out.println(strNum1 + " IS THE PALINDROME NUMBER");
	}
	else
	{
		System.out.println(strNum1 + " IS NOT A PALINDROME NUMBER");
	}
}
}
