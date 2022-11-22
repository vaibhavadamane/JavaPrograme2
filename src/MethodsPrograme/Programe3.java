package MethodsPrograme;

public class Programe3 {
 //Non static method call in same class
 public void add()
 {
	 int num1,num2,num3,c;
	 num1=100;
	 num2=200;
	 num3=500;
	 c=num1+num2+num3;
	 
	 System.out.println("Addition of three number = " + c);
 }
 public void mul()
 {
	 int num1,num2,num3,c;
	 num1=10;
	 num2=2;
	 num3=10;
	 c=num1*num2*num3;
	 
	 System.out.println("Multication of three number = " + c);
 }
 public static void main(String[] args) {
	Programe3 x = new Programe3();
	x.add();
	x.mul();
}
 
 





}
