package LogicalProgram;

public class PrimeNum 
{
public static void main(String[] args) 
{
//Prime Number:- A number which is divisible by the 1 and itself is called as the Prime number
	
	int num = 17;
	int count = 0;
	 
	for(int i=2;i<17;i++)
	{
		if(num%i==0)
		{
			count++;
			break;
		}
	}
	if(count==1)
	{
		System.out.println("Not a Prime Number");
	}
	else
	{
		System.out.println("Prime Number");
	}
	}	
}
