package Methods;

public class Programe7 {

	// non static method with parameter in same class
	 
	public void studentName(String name) {
	
		System.out.println("Name of the Student =" + name);
	}
	public void studentAge(int age)
	{
		System.out.println("Age of the student =" + age);
	}
	public void studentGrade(char grade)
	{
		System.out.println("Grde of the student =" + grade);
		}
	 public static void main(String[] args) 
	 {
     Programe7 x = new Programe7();
     x.studentName("Vaibhav");
     x.studentAge(24);
     x.studentGrade('A');
	}

	}
	
	

