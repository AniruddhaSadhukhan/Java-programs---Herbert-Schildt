
//Program to understand dynamic method dispatch by applying method overriding
//		by Aniruddha

//using runtime polymorphism

class Figure
{
	double a,b;
	
	Figure(double i,double j)
	{
		a = i;
		b = j;
	} 
	
	double area()
	{
		System.out.println("Area of Figure is undefined ");
		return 0;
	}
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


class dynamic_method_dispatch
{
	public static void main(String args[])
	{	
		Figure f = new Figure(10,10);
		Rectangle r = new Rectangle(9,5);
		Triangle t = new Triangle(10,8);
		
		Figure figref;
		
		figref = r;
		System.out.println("Area = "+figref.area());
		
		figref = t;
		System.out.println("Area = "+figref.area());
		
		figref = f;
		System.out.println("Area = "+figref.area());
	}
}

/*Sample Output
Inside Area of Rectangle 
Area = 45.0
Inside Area of Triangle 
Area = 40.0
Area of Figure is undefined 
Area = 0.0

*/
