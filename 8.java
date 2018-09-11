import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CaseConverter
{
	String camelCase(String str)
	{
		StringBuilder builder = new StringBuilder(str);
		// Flag to keep track if last visited character is a 
		// white space or not
		boolean isLastSpace = true;
		
		// Iterate String from beginning to end.
		for(int i = 0; i < builder.length(); i++)
		{
			char ch = builder.charAt(i);
			
			if(isLastSpace && ch >= 'a' && ch <='z')
			{
				// Character need to be converted to uppercase
				builder.setCharAt(i, (char)(ch + ('A' - 'a') ));
				isLastSpace = false;
			}
			else if (ch != ' ')
				isLastSpace = false;
			else
				isLastSpace = true;
		}
	
		return builder.toString();
	}
	public static void main(String[] args) 
	{
		
		
		CaseConverter converter = new CaseConverter();
		
		String str = converter.camelCase("This is the sample string");
		
		System.out.println(str);

	}

}
	
