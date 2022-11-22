package LogicalProgram;

public class AddOfNum 
{
public static void main(String[] args)
{
	
	//Here we add the digits of the particular number 98970=9+8+9+7+0=33
	int num = 98970,sum=0;
	while(num>0)   //here we have only one value which already present so we use the while loop
	{
		int temp = num%10;  // this is get each digit.
		num = num/10;       //This will get reaming value
		sum = sum + temp;
	//	System.out.println(sum);
	}
	System.out.println("Total Addtion of the number = " +sum);
}
}
