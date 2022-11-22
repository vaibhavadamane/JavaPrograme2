package PattranProg;

public class Prog4 
{
public static void main(String[] args) 
{
// Print ***	
//       **
//       *
	
//	int star=10,space=0; 
//if we increase the row if loop are decreasing order that change the initial value of the star,here value of row is 
//equal to the value of the star because our design contain the at last at least one star.	
//	for(int row=1;row<=10;row++)
//	{
//		for(int i=1;i<=star;i++)
//		{
//			System.out.print("*");
//		}
//		for(int j=1;j<=space;j++)
//		{
//			System.out.print(" ");
//		}
//		System.out.println();
//		star--;
//		space++;
//	}

//==================================================================================================================	
	
// Print ***
//	      **
//	       *
	
	int star=10,space=0;
	for(int row=1;row<=10;row++)   //only change the for loop 
	{
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
		for(int i=1;i<=star;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		star--;
		space++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
}
