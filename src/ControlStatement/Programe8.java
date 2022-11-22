package ControlStatement;

public class Programe8 {
	
// Various operation in given no like +,-,*,/ (Switch Statement)
	
	public static void main(String[] args) {
		
   char operation ='/';
   int a=50,b=10,result;
   
   switch(operation)
   
   {
   case'+':
	   result = a+b;
	   System.out.println("Sum = " +(a+b));//we will also take result
	   break;
	   
   case'-':
	   result = a-b;
	   System.out.println("Sum = " +result);
	   break;
	   
   case'*':
	   result = a*b;
	   System.out.println("Mul = " +result);
	   break;
	   
   case'/':
	   result = a/b;
	   System.out.println("Div = " +result);
	   break;
	   
	   default:
		   System.out.println("Incorrect Operation");
	
	
		   
	   
	   
	   
   }
	}

}
