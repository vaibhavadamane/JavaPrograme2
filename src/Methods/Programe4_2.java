package Methods;
     //static method with parameter from different class
public class Programe4_2 {

	public static void mul(int num1,int num2)
	{
	   int result = num1 * num2;
	
	System.out.println("Mulitiplication of two number =" + result);
	
	}
	
	public static void main(String[] args) {
		
		int a=40,b=10,div;
		div = a/b;
		
		int num1,num2,sub;
		num1=100;
		num2=50;
		sub = num1 - num2;
		
		System.out.println("Division=" + div);
		System.out.println("Subtraction=" + sub);
	    Programe4_1.add(100);
		Programe4_1.mul(20, 30);
		Programe4_2.mul(100,100);
	}

}
