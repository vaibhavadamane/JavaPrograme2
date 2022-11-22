package PattranProg;

public class Prog3 {

	public static void main(String[] args) {
//Print *
//      **
//	    ***

//	int star=1,space=2;
//	
//	for(int row=1;row<=3;row++)
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
//		star++;  //(If u don't write this so the implementation take place only one time like *__)
//		space--;
//	}
		
//================================================================================================================	
		
//Print   *
//	     **
//	    *** 
		
     int star=1,space=9;
//Note:-when we increase the row if space will be print first that time we change initial value of space the value of the
//the space is (Total no of row - 1) here total row is 10 then initial value of the space is 9.     
     
    for(int row=1;row<=10;row++)  //only change the for loop 
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
		star++;  //(If u don't write this so the implementation take place only one time like *__)
		space--;
	}
		
	}
}