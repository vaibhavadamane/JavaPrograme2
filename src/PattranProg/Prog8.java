package PattranProg;

public class Prog8 {

	public static void main(String[] args)
	{
//Print   *****		
//         ***
//	        *
//	       ***
//	      *****
	
	int star=5,space=0,row;
	for(row=1;row<=5;row++)
	{
		for(int i=1;i<=space;i++)
		{
			System.out.print(" ");
		}
		for(int j=1;j<=star;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		if(row<=2)
		{
		   star=star-2;
		   space++;
		}
		else
		{
			space--;
			star=star+2;
		}
		
	}
}

}
