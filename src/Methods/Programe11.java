package Methods;



//non static method with return type call in same class

public class Programe11 {
	
	    public int div()
		{
			int num1=120,num2=15,result;
			result=num1/num2;
			return result;
		
			
		}
		 public int add() {
			 int a=199,b=1,result;
			 result=a+b;
			 return result;
			 
		 }
		 public double sub() {
			 double a=60.50,b=00.50,result;
			 result=a-b;
			 return result;
			
		 }
		 public static void main(String[] args) 
		 {
			 Programe11 a = new Programe11();
			int output = a.div();
			System.out.println(output);
			System.out.println("Multiplication of two number = " +output*8);
			System.out.println("************");
			
			int x = a.add();
			System.out.println(x);
			System.out.println("Addtion of two number = " +x/20);
			System.out.println("************");
			
			double y = a.sub();
			System.out.println(y);
			System.out.println("Substracrion of two number = " +y/20);
		    System.out.println("*************");
		    
			System.out.println("Division of two number = " +a.div());//method2
		 
		 
		 }
		 
		 
	}


