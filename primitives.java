import java.io.*;

//Program to show different primitives and string
//		by Aniruddha

class primitives
{
	public static void main(String args[])
	{
		byte a=1 ;	//-128 to 127 
		short b=0 ;	//-32,768 to 32,767
		int c=31 ;	//-2^31 to 2^31 - 1
		long d=10 ;	//-2^63 to 2^63 - 1
		float e= 2.0f;
		double f=10.55 ;
		char g='H',i='w',j='r',k='d';
		boolean h= true;
		String  s;//not primitive,real type
		
		s= "" + g + c + d + " " + i + b + j + a + k + " " + e;
		
		System.out.println(s + " " + f + " " + h);	
	}
}

/*Sample Output
H3110 w0r1d 2.0 10.55 true
*/
