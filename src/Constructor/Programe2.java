package Constructor;

public class Programe2 {

	static int num1,num2;
	 
	public Programe2()
	{
	num1=100;    //We use the constructor for intiliation of data member or variable
    num2=200;
	 }
	public static void main(String[] args) {
    	System.out.println("Num1 =" + num1);
	    System.out.println("Num2 =" + num2);
		System.out.println("After creating the object,constrctor get called and data member get initalise");
	    Programe2 x = new Programe2();
	    System.out.println("Num1 =" + num1);
        System.out.println("Num2 =" + num2);
	    
		
	}
}
