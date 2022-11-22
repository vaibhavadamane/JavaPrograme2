package Constructor;

public class Programe3 {
int a,b;
public Programe3()
{
	a=100;
	b=200;
	//we use the constructor to initialized the data member
	// and use the another method to further process,when we create the object the constructor get automatically called
}
public void display()
{
	System.out.println("Value of A =" + a);
	System.out.println("Value of B =" + b);
	
}
public static void num()
{
int num1=20;
System.out.println(num1);
}
public static void main(String[] args) {
	Programe3 y = new Programe3();
	y.display();

}
}
