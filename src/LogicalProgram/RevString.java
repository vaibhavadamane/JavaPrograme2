package LogicalProgram;

public class RevString {

public static void main(String[] args) 
{
         String str1 = "Selenium";	// Here we separate out the each character form Selenium word in reverse order.
         String str2 = "";          // And we store that character  here.
         
        // char chr;
         
         int len = str1.length();
         System.out.println("Lenght of the word = " + len); //8
         
         for(int i=len-1;i>=0;i--) // this loop give us reverse order.NOTE:- Here we take a i>=0; and we go 8>7>6>5>4>3>2>1>0
         {
        	  char chr = str1.charAt(i);  // this method give us the each character.
        	  str2 = str2 + chr;   // If we add like str2 = chr + str2; then we got a same order like Selenium.
           // System.out.println("Rev String = " + str2);
         }
              System.out.println("Final Rev String Of Word Selenium = " + str2);
}

}
