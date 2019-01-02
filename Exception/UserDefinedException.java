
//Program to create User Defined Exception 
//	to check validity of age
//		by Aniruddha

//defining subclass of Exception
class InvalidAgeException extends Exception
{
	private int age;
	
	InvalidAgeException(int a)
	{
		age = a;
	}
	
	
	//overrides toString() allowing exception description to be displayed using println()
	public String toString()	
	{
		return "Age: "+age+" is not valid age";
	}
}


class UserDefinedException
{

	static void checkAge(int age) throws InvalidAgeException
	{
		System.out.println("Checking Age validity : (" +age + ")");
		
		if(age<0 || age>100)
			throw new InvalidAgeException(age);	
			
		System.out.println("Age : " +age + " is a valid age");	
	}

	public static void main(String args[])
	{	
		try
		{
			checkAge(25);
			checkAge(-5);
			checkAge(50);	//not executed as previous statement throws error
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception: "+e);
		}
	}
}

/*Sample Output
Checking Age validity : (25)
Age : 25 is a valid age
Checking Age validity : (-5)
Exception: Age: -5 is not valid age

*/
