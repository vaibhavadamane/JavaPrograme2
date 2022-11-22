package Methods;
//Method (Static and non static method) with return type call in same class
public class Programe9 {
//here we can use datatype in place of void .....
	public static  int mul()
	{
	int num1=20,num2=30,result;
	result=num1*num2;
	return result;
	
	}
   public String printName()
   {
	   String name="Vaibhav";
       return name;
	   
   }
//   public void add() //( non static method)
//   {
//	  System.out.println(10+20);
//    }
   public static void main(String[] args) 
   {
     int output = mul();//when we stay mouse on output world that time datatype is automatically raised
	System.out.println(output);//method 1
	System.out.println("Result of multiplication =" + mul());//method 2
	//use of the return type is following....by using first type of method
	System.out.println("......:-" + output*100);
	
	Programe9 x = new Programe9();
	
//	x.add();
	System.out.println("Name of character =" + x.printName());
	
	
   }




}



