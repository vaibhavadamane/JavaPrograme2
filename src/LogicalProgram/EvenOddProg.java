package LogicalProgram;

import java.util.Scanner;

public class EvenOddProg
{
public static void main(String[] args) 
{
	int num;
//  System.out.println(11.0/2.0);   	//5.5 (Double Data type is give perfect answer)
//	System.out.println(11/2);           //5 (Int value gives Int value )
//	System.out.println(11%2);           //1 (Modules give us only remainder value)
//	System.out.println(131414329%10);   //9 (Here also it gives remainder value)
	
	System.out.println("Enter the Number");
	Scanner s = new Scanner(System.in);
	num = s.nextInt();
	System.out.println("User Entered = " +num);

//when we divide the any Even number by 2 then remainder must zero(0).means the number which is remainder is 0 then this is a even number.


	if(num%2==0)
	{
		System.out.println(num + " Number is Even");
	}
	else
	{
		System.out.println(num + " Number is Odd"); 
	}
}
}
