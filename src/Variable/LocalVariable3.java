package Variable;

public class LocalVariable3 {
// Differences between the static and global or instance variable
	
	static int num1=10;//common memory of class where a= 10,11,13,14...
	int num2=10;//Three object,each object variable b is separate..
	// for z, num1=10 initially 11,13,13..
	// for x, num1=10 initially 11
	// for y, num1=10 initially 11
	//Major Diff :- in non static variable save the memory 4 byte * no of object.
	//while in static variable is only take 4 byte for no of object
    // so static variable is called as memory management variable
	public void add1()
	{
		num1++;//10 ->11
	    num2++; //10 ->11
		System.out.println("A = " +  num1+ " " + "B = " + num2);
	}
//	public void add2()
//	{
//		num1--;
//        num2--;
//		System.out.println("A = " +  num1+ " " + "B = " + num2);
//	}
	
	public static void main(String[] args) {
		LocalVariable3 z = new LocalVariable3();		
		z.add1();
		z.add1();
		z.add1();
		LocalVariable3 x = new LocalVariable3();
		x.add1();
		LocalVariable3 y = new LocalVariable3();
		y.add1();
		y.add1();
		
	}
	
}
	

