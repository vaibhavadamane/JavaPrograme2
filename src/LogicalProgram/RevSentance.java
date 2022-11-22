package LogicalProgram;

public class RevSentance 
{
public static void main(String[] args) 
{
    String sentance = "I am learning software testing with price of 40000 1-NOV-2022";
	String spilt [] = sentance.split(" ");//We take the String Array to store each world present in the sentence.
	
	System.out.print("Orginal Sentance = ");
	for(String value:spilt) //by using the for each loop we can execute the String Array
	{
		System.out.print(value + " ");
	//	System.out.println(value + " ");
	}
	
	System.out.print("\nReverse Sentance = ");
	for(int i=spilt.length-1;i>=0;i--)
	{
		System.out.print(spilt[i] + " ");
	}
}
}
