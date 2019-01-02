import java.io.*;
import java.util.Scanner;

//Program to get input by Scanner class
//		by Aniruddha

class input
{
	public static void main(String args[])
	{	
		Scanner in = new Scanner (System.in);
		
		System.out.print("Input an Integer = ");
		int a = in.nextInt();
		
		System.out.print("Input a Long Integer = ");
		long b = in.nextLong();
		
		System.out.print("Input a Float = ");
		float c = in.nextFloat();
		
		System.out.print("Input a Double = ");
		double d = in.nextDouble();
		
		System.out.print("Input a Character = ");
		char e = in.next().charAt(0);
		
		System.out.print("Input a String = ");
		String f = in.next();
		
		//Printing scanned primitives and string
		
		System.out.println("\nInteger      : "+a);
		System.out.println("Long Integer : "+b);
		System.out.println("Float        : "+c);
		System.out.println("Double       : "+d);
		System.out.println("Character    : "+e);
		System.out.println("String       : "+f);
		
		//closing the scanner
		in.close();
	}
}

/*Sample Output
Input an Integer = 5
Input a Long Integer = 64565
Input a Float = 654.564
Input a Double = 65665.585446564
Input a Character = g
Input a String = Aniruddha

Integer      : 5
Long Integer : 64565
Float        : 654.564
Double       : 65665.585446564
Character    : g
String       : Aniruddha
*/
