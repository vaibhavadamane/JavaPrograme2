package LogicalProgram;

public class RevEachWordInSentance 
{
public static void main(String[] args) {
	
	String sentance = "I am an Automation Engineer";
	String spilt [] = sentance.split(" ");//We take the String Array to store each world present in the sentence.
	
	System.out.print("Original Sentance = ");
	for(String value:spilt)
	{
		System.out.print(value + " ");
	}
	
	System.out.print("\nReverse Sentance = ");
	for(int i=spilt.length-1;i>=0;i--)
	{
		System.out.print(spilt[i] + " ");
	}
	
	System.out.print("\nReverse each word in the sentance = ");
	
	String strRev = "";
	String revSent [] = new String[5];
	
	//Method 1
	for(int i=0;i<spilt.length;i++)
	{
// Re-initialize the revSent Because it update each loop then our output like, I maI namaI noitamotuAnamaI reenignEnoitamotuAnamaI 		
		strRev = "";
		for(int j=0;j<spilt[i].length();j++)
		{
			char ch = spilt[i].charAt(j);
			strRev = ch + strRev;
		}
		revSent[i]=strRev;
	}
	
	//Method 2
	for(int i=spilt.length-1;i>=0;i--) // only change here
	{
		strRev = "";
		for(int j=0;j<spilt[i].length();j++)
		{
			char ch = spilt[i].charAt(j);
			strRev = ch + strRev;
		}
			revSent[i]=strRev;
	}	
	
	for(String value:revSent)
	{
	System.out.print(value + " ");
	}
}
}
