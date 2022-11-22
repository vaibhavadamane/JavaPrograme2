package Methods;

public class Programe8_2 {

	public void div()
	{
		int a=40;
		int b=20;
		int c=a/b;
		System.out.println("Value of Division =" + c);
	}
	public static void main(String[] args) {
		Programe8_1 z = new Programe8_1();
		
		z.studentInfo("Vaibhav",24,10,'A');
		
		System.out.println("---------------");
		
		z.empolyeeInfo("Anil",101,100000,"Pune");
         
		System.out.println("-----------------");
		 
		Programe8_2 y = new Programe8_2();
		
		y.div();
		
	}

	
	
}
