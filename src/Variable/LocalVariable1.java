package Variable;
//Local as well as instance/global variable and static Variable
public class LocalVariable1 {

	static int d=300; //Instance/global variable (Static variable)
	int e=400; //Instance/global variable (Non-Static variable) permanent variable
	
	
	public static void add()
	{
		int r=10, a=100,b=200,c;//Local Variable (limited only this method) temporary variable
		c=a+b;
		System.out.println("Addition of two number =" + c);
	    System.out.println("D =" + d);
	    //In static method we can excess only static variable
	}
	public void mul()
	{
		int f=10;
	System.out.println("D = " + d);
	//we can excess static variable in non static method
	System.out.println("E = " + e);
	//we can excess non static variable in non static variable
	System.out.println("F =" + f);
	}
	
	public static void main(String[] args) {
		 add();
		 System.out.println("D =" + d);
		 LocalVariable1 z = new LocalVariable1();
		 z.mul();
	}
	
	
	
}
