package ControlStatement;

public class Programe3 {
	
//WAP for which decided the Marksheet in student (else if)
	
	public static void main(String[] args) {
		 
		//35-60=Second class
		//60-70=First class
		//70-89=Distinction
		//89-100=Merit
		//>100=Wrong input
		
    int marks=99;
    
    if(marks>=35 && marks<60)
    {
    	System.out.println("Student is passed in second class");
    }
    else if(marks>=60 && marks<70)
    { 
    	System.out.println("Student is passed in first class");
    }
    else if(marks>=70 && marks<89)
    {
    	System.out.println("Student is passed in distiction");
    }
    else if(marks>=89 && marks<=100)
    {
    	System.out.println("Student is passed in merit");
    }
    else if(marks>100)
    {
    	System.out.println("Wrong iutput");
    }
    else 
    {
    	System.out.println("Student is failed");
    	}
	}
}
    
    	
   
    	
  
    	
	


