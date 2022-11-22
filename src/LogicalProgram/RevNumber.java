package LogicalProgram;

public class RevNumber 
{
public static void main(String[] args) 
{
	int num = 780090;
	String strNum = Integer.toString(num);//we convert the Int into String
	String strNum1 = "";
	char num1;
	
	for(int i=strNum.length()-1;i>=0;i--)
	{
		num1 = strNum.charAt(i);
		strNum1 = strNum1 + num1;
	}
	System.out.println("Reverse Number = " + strNum1);	
}
}
