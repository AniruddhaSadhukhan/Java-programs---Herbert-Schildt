import java.io.*;

//Program to understand static methods
//		by Aniruddha



class Year
{
	static int day,date,month,year;
	
	static void input()
	{
		day=5;
		date=22;
		month=6;
		year=2017;
	}
	
	void show()
	{
		System.out.println("Day = "+day);
		System.out.println("Date = "+date);
		System.out.println("Month = "+month);
		System.out.println("Year = "+year);	
	}
}



class static_methods
{
	public static void main(String args[])
	{	
		Year.input();	
		/*static method can be accessed directly 
		by the class name and does not need any object*/
		Year yr =new Year();
		yr.show();
	}
}

/*Sample Output
Day = 5
Date = 22
Month = 6
Year = 2017
*/
