
//Program to understand package
//		by Aniruddha

package MyPack;

/* The balance class ,its constructor and show() method are public
This means they can be used by non subclass code outside their package */

public class Balance
{
		double bal ;
		String  name;
		
		public Balance(String n,double b)
		{
			name = n;
			bal = b;
		}
		
		public void show()
		{
			System.out.println(name + ": Rs. " + bal);		
		}
}

/*
Only compile this to .class file
*/
