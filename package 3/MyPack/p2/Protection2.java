
//Program to understand package
//		by Aniruddha

package p2;

class Protection2 extends p1.Protection
{
	Protection2()
	{
		System.out.println("Derived Other Package Constructor");
		
		//System.out.println("n = "+ n);		//class,package only
		//System.out.println("n_pri = "+ n_pri);	//class only
		System.out.println("n_pro = "+ n_pro);
		System.out.println("n_pub = "+ n_pub);
	}
}

