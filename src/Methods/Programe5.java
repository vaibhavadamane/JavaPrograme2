package Methods;

public class Programe5 {

	// Non Static method call from same class..
	
	public static void m1()
	{
		System.out.println("This is the m1 method");
	}
     
	public void m2()
	{
		System.out.println("This is the m2 method");
	}
	  public void m3()
	  {
		  System.out.println("This is the m3 method");
	  }
	  public void m4()
	  {
		  System.out.println("This is the m4 method");
	  }
	  
	  public static void main(String[] args) {
		 m1();
	     Programe5 abc = new Programe5();//This is the object which is run in class
		 abc.m2();
		 abc.m3();
		Programe5 xyz = new Programe5();//This is the new object
		 xyz.m4();
		 // here abc is object
		 //creating the object
		 //Programe5:-class,Data type
		 //abc:-object/variable reference/variable
		 //new:-It is used to create memory which has some name (abc)
		 //It store the data of the class
         //Programe5():-object/constructor
		 }
}
