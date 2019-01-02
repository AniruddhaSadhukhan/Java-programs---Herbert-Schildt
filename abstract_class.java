
//Program to understand abstract class and methods
//		by Aniruddha

/* abstract class defines a superclass that declares the structure of 
a given abstraction without providing a complete implementation of every method
*/

abstract class Figure
{
	double a,b;
	
	/* We cannot declare abstract constructor or abstract static methods */.
	
	Figure(double i,double j)
	{
		a = i;
		b = j;
	} 
	
	/* All the subclasses must override the abstract method as 
	they have no implementation specified in the superclass */
	
	abstract double area();
}

class Rectangle extends Figure
{	
	Rectangle(double a,double b)
	{
		super(a,b);
	} 
	
	//override area for Rectangle
	double area()
	{
		System.out.println("Inside Area of Rectangle ");
		return a*b;
	}
}

class Triangle extends Figure
{	
	Triangle(double a,double b)
	{
		super(a,b);
	} 
	
	//override area for Triangle
	double area()
	{
		System.out.println("Inside Area of Triangle ");
		return 0.5*a*b;
	}
}


class abstract_class
{
	public static void main(String args[])
	{	
		/* There can be no objects of an abstract class i.e. an abstract 
		class cannot be directly instantiated with new operator */
		
		//Figure f = new Figure(10,10);  //illegal now
		
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure figref; //This is Ok ,no object is created
		
		figref = r;
		System.out.println("Area = "+figref.area());
		
		figref = t;
		System.out.println("Area = "+figref.area());
		
	}
}

/*Sample Output
Inside Area of Rectangle 
Area = 45.0
Inside Area of Triangle 
Area = 40.0

*/
