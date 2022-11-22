package Methods;

public class Programe1 {
	 
	//Static method call(run) for same class
	
		public static void show ()
		{
			System.out.println("This is show method");
		}
		public static void display()
		{
			System.out.println("This is display method");
			}
		public static void print()
		{
			System.out.println("This is print method");
		}
        
		public static void main(String[] args) 
		{
			System.out.println("Main method stared");
			show();
			display();
			print();
			System.out.println("Main method ended");
			}
	}


