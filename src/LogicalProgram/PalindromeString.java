package LogicalProgram;

public class PalindromeString
{
public static void main(String[] args) 
{
// PalindromeString:-A string is said to be Palindrome if it remains the same on reading from both ends. 
// It means that when you reverse a given string, it should be the same as the original string.
// Original String = Reverse String.(it remains the same when you read it from the beginning to the 
// end and end to beginning.
	
	String str1 = "MADAM";
	String str2 = "";
    
	char ch;
	for(int i=str1.length()-1;i>=0;i--)
	{
	    ch = str1.charAt(i);
		str2 = ch + str2;
	}
	System.out.println(str2);	
	
	if(str1.equals(str2)) // when we comparing the string that we use the equals to method
	{
		System.out.println(str2 + " IS THE PALINDROME STRING");
	}
	else
	{
		System.out.println(str2 + " IS NOT A PALINDROME STRING");
	}
	}
    
}
