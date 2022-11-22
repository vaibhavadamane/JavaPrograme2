package Methods;

    public class Programe3{

     //Static method with parameter from same class
    	
//    	public static void add()
//    	{
//    		int a=10,b=20,c;
//    		c = a + b;
//    		System.out.println("Addition =" + c);
//    	}
// 
//    	public static void main(String[] args) 
//    	{
//    		System.out.println();
//    		add();
//    	}
//     The follwing methos is simple/Genral with parameter

       public static void showName(String Name) //name:-Harry
       {
    	   System.out.println("Name of the person=" + Name);
       }

      public static void add(int num1,int num2) //Num1=10 it is Parameter,argument signture
      {
    	  int result = num1 + num2;
    	System.out.println("Addition by method with Parameter=" + result);
    	 
      }
      public static void main(String[] args) {
	   showName("Herry");
	   add(10,300);
	}






}
