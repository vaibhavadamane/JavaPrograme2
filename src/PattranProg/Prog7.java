package PattranProg;

public class Prog7 {

public static void main(String[] args)
{
//Print  ***	row=1	
//       **     row=2
//       *      row=3
//	     **     row=4
//       ***    row=5
	
	int star=3,space=0,row;
	for(row=1;row<=5;row++)
	{
		for(int i=1;i<=star;i++)
		{
			System.out.print("*");
		}
		for(int j=1;j<=space;j++)
		{
			System.out.print(" ");
		}
	System.out.println();
	if(row<=2)  //remember that think row<=2.
	{
		star--;
		space++;
	}
	else
	{
		star++;
		space--;
	}
  }
}
}
