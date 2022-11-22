package LogicalProgram;

public class FactorealProg
{
public static void main(String[] args) {
	
	//4!=1x2x3x4=24
	//5!=1x2x3x4x5=120
	int fact = 1;
	for(int i=1;i<=5;i++)
	{
		fact = fact * i;
		System.out.println("Fact = " + fact); 
	//if we print the fact under the for loop that time we got value of each loop
	//Fact step-1 => 1 * 1 = 1
	//Fact step-2 => 1 * 2 = 2
	//Fact step-3 => 2 * 3 = 6
	//Fact step-4 => 6 * 4 = 24
	//Fact step-5 => 24 * 5	= 120
	}
	System.out.println("Total Fact = " + fact);
	
}
}
