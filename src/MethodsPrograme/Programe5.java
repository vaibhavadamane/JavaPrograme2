package MethodsPrograme;

public class Programe5 {

	//non static method call in same class
	
	public void jobProflie() {
	String name1;
	String name2;
	String name3;
	
	name1="Chemist";
	name2="Engineer";
	name3="Pilot";
	
		System.out.println("Vaibhav's job proflie =" + name1);
		System.out.println("Suraj's job proflie =" + name2);
		System.out.println("Kiran's Job proflie =" + name3);
	
	}

    public void information()
    
    {
    	String Name;
    	int age;
    	String jobProflie;
    	int birthdate;
    	double salary;
    	String moblieNo;
    	
    	Name="Ajay";
    	age=20;
    	jobProflie="Doctor";
    	birthdate=1997;
    	salary=30000;
    	moblieNo="8975688065";
    	
    	System.out.println("Name of Client =" + Name);
    	System.out.println("Age of client =" + age);
    	System.out.println("Job proflie of client =" + jobProflie);
    	System.out.println("Birthdate of client =" + birthdate);
    	System.out.println("Salary of client =" + salary);
    	System.out.println("Moblie no of client =" + moblieNo);
      }
    	 
    public static void main(String[] args) {
		
    	Programe5 x = new Programe5();
    	x.jobProflie();
    	System.out.println("*********************");
    	x.information();
	}
     }
	

