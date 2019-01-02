import java.io.*;

//Program to understand bitoperators
//		by Aniruddha

class bitoperator
{
	public static void main(String args[])
	{	
		int  a=60,b=13;	
		System.out.println("Input:\na="+a+" ("+Integer.toString(a,2)+")" );
		System.out.println("b="+b+" ("+Integer.toString(b,2)+")" );
		
		System.out.println("a & b = "+(a&b )+" ("+Integer.toString(a&b ,2)+")");	
		System.out.println("a | b = "+(a|b )+" ("+Integer.toString(a|b ,2)+")");	
		System.out.println("a ^ b = "+(a^b )+" ("+Integer.toString(a^b ,2)+")");	
		System.out.println("~a    = "+(~a  )+" ("+Integer.toString(~a  ,2)+")");	
		System.out.println("a<<2  = "+(a<<2)+" ("+Integer.toString(a<<2,2)+")");
		/*>> operator automatically fills the high order bit with its previous contents
		each time a shift occurs.This preserves the sign of the value */	
		System.out.println("a>>2  = "+(a>>2)+" ("+Integer.toString(a>>2,2)+")");
		/*>>> operator(unsigned shift) automatically fills the high order bit with zero
		each time a shift occurs.*/		
		System.out.println("a>>>2 = "+(a>>>2)+" ("+Integer.toString(a>>>2,2)+")");
	}
}

/*Sample Output
Input:
a=60 (111100)
b=13 (1101)
a & b = 12 (1100)
a | b = 61 (111101)
a ^ b = 49 (110001)
~a    = -61 (-111101)
a<<2  = 240 (11110000)
a>>2  = 15 (1111)
a>>>2 = 15 (1111)

*/
