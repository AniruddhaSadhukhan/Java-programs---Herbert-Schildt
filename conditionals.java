import java.io.*;

//Program to show use of conditionals
//		by Aniruddha

class conditionals
{
	public static void main(String args[])
	{	
		int  a=10;
		boolean b;	
		String x = new String("Ani");
		String y = new String("Ani");
		String sameX = x; 
		//if else
		
		if (a<5) 
		{  
			System.out.println("a is less than 5\n");	
		} 
		else if (a>5)
		{ 
			System.out.println("a is greater than 5\n");	
		}
		else
		{
			System.out.println("a is equal to 5\n");	
		}
		
		//ternary
		
		System.out.println("a is "+(a%2==0?"even":"odd") + "\n");
		
		//== and equals
		
		b=x == y;				//false -> x and y are not the same object
		System.out.println("x==y        :"+b);
		b=x.equals(y);				//true -> x and y are logically equal
		System.out.println("x.equals(y) :"+b);
		b=x == sameX;				//true -> x and sameX are really the same object
		System.out.println("x==sameX    :"+b);	
	}
}

/*Sample Output:

a is greater than 5

a is even

x==y        :false
x.equals(y) :true
x==sameX    :true

*/
