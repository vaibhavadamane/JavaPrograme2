package Constructor;

public class Programe5 {
//we use same parameter but the counting of variable are different 

	//Constructor/Method overloading concept....
	
    public Programe5()
     {
	   System.out.println("This is zero parameter constrctor");
     }
    public Programe5(int a)
     {
	  System.out.println("This contain one int parameter =" + a);
	 }
    public Programe5 (int b,int c)
    {
    	int d=b+c;
    	System.out.println("Addition of the two number =" + c);
    }
	public Programe5(char c)
    {
    System.out.println("This contain one char parameter =" + c);
    }
    public Programe5(double e)
    {
    System.out.println("This contain onr double parameter =" + e);
    }
    public Programe5(String mob)    
    {
    System.out.println("Moblie no =" + mob);
    }
    public static void main(String[] args) 
    {
    Programe5 A = new Programe5();
	Programe5 B = new Programe5(100);
    Programe5 C = new Programe5(200,500);
    Programe5 D = new Programe5('A');
    Programe5 E = new Programe5(2.89);
    Programe5 F = new Programe5("8975688065");
    }
    }

