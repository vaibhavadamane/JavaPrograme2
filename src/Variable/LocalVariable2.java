package Variable;

public class LocalVariable2 {
//we can excess static variable in main method in same class and diff class
	//we can use *variableName* when we execute static variable in same class
	//we can use *className.VariableName* when we execute static variable in diff class
	static int a=100;
	public static void main(String[] args) {
		System.out.println("Value of A =" + a);
		//This variable call in same class
		System.out.println("Value of D =" + LocalVariable1.d);
		//This is the previous class variable call in diff class
	}
	
	
	
}
