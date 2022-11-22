package Constructor;

public class BlockPrograme {
    //Difference between static & instance block
	//Static block as well as is executed before the Constructor
	//we do not call the static block in main method because it is  belong to class
	int a=100;
    static int b=300;
    public BlockPrograme() //This is the Constructor 
    {
    	System.out.println("This is Constrctor");
    }
    public void show() //This is the Show method ( non static method)
    { 
    	System.out.println("This is Non Static method");
    }
    public static void display() //This is the Display method( static method)
   {
	   System.out.println("This Static method");
   }
    static // This is the Static Block
  {
	  System.out.println("This is Static Block");
//    System.out.println("Value of A =" + a);
	  System.out.println("Value of B =" + b); 
  }
  // This is the Instance Block
   {
	  System.out.println("This is Instance Block");
	  System.out.println("Value of A =" + a);
      System.out.println("Value of B =" + b);
  }
   
    public static void main(String[] args) 
    {
	 BlockPrograme X = new  BlockPrograme();
	 X.show();
     display();
    }
}











