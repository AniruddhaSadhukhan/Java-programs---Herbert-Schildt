
//Program to understand package
//		by Aniruddha

package p1;

class Derived extends Protection
{
	Derived()
	{
		System.out.println("Derived Constructor");
		System.out.println("n = "+ n);
		//System.out.println("n_pri = "+ n_pri);	//class only
		System.out.println("n_pro = "+ n_pro);
		System.out.println("n_pub = "+ n_pub);
		
	}
		
}

/*
Only Compile to .class
*/
