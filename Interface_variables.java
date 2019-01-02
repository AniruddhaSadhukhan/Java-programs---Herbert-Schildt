
//Program to understand the concept of Interface variables
//		by Aniruddha

import java.util.Random;	//this class provides pseudorandom numbers

interface SharedConstants
{
	int NO    = 0 ;		//variables inside interface declaration are implicitly final and static 
	int MAYBE = 1 ;		//i.e. they act as constants
	int YES   = 2 ;
	int LATER = 3 ;
	int SOON  = 4 ;
	int NEVER = 5 ;
}

class Question implements SharedConstants
{
	Random rand = new Random();
	
	int ask()
	{
		int prob = (int) (100 * rand.nextDouble());
		
		if (prob < 30)
			return NO;
		else if (prob < 45)
			return MAYBE;
		else if (prob < 60)
			return YES;
		else if (prob < 75)
			return LATER;	
		else if (prob < 98)
			return SOON;
		else 
			return NEVER;					
	}
}

class Interface_variables implements SharedConstants
{
	static void answer(int result)
	{
		switch (result)
		{
			case NO: System.out.println("NO");break;
			case MAYBE: System.out.println("MAYBE");break;
			case YES: System.out.println("YES");break;
			case LATER: System.out.println("LATER");break;
			case SOON: System.out.println("SOON");break;
			case NEVER: System.out.println("NEVER");break;
		}
	}	
	
	
	
	public static void main(String args[])
	{	
		Question q = new Question();
		
		for(int i=0;i<10;i++)	
			answer(q.ask());
	}
}

/*Sample Output		//Results are different each time it is run
NO
YES
SOON
MAYBE
MAYBE
SOON
NEVER
YES
MAYBE
NO

*/
