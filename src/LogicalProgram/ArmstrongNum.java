package LogicalProgram;

public class ArmstrongNum
{
public static void main(String[] args) 
{
//Armstrong number is a number that is equal to the sum of cubes of its digits. 
//For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers.
//153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153.

	int num=153,sum=0;
	int num1=num; //Here num value is vary every time because we dived the num by 10 so we can initialize this value in num1.
	
	while(num>0) //if we have only one number that time we use the while loop 
	{
		int temp = num%10;   //153%10=3
		sum = sum + (temp * temp * temp);
		num = num/10;        //153/10=15
	}
	
	System.out.println(sum);
	
	if(num1==sum)
	{
		System.out.println("This is Armstrong Number");
	}
	else
	{
		System.out.println("This is Not a Armstormg Number");
	}
}
}
