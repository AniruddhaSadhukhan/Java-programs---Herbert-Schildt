import java.io.*;
import java.util.Scanner;

//Program to understand Java Scanner with Delimiter
//		by Aniruddha

class scanner_with_delimiter
{
	public static void main(String args[])
	{	
	
		String  s = "10 fish redfish   20 fish blue  fish ";
		
		Scanner in = new Scanner(s);
		in.useDelimiter("\\s*fish\\s*");
		/*  \s represents whitespace 
		    \\s* : 0 or more repetation of whitespace 
		    fish is the pattern to find                  */
		
		
		System.out.println("Input : "+s);
		System.out.println("Delimiter used : "+in.delimiter());
		System.out.println(in.nextInt());
		System.out.println(in.next());
		System.out.println(in.nextInt());
		System.out.println(in.next());
		
		in.close();	
	}
}

/*Sample Output
Input : 10 fish redfish   20 fish blue  fish 
Delimiter used : \s*fish\s*
10
red
20
blue
*/
