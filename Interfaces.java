
//Program to understand interfaces
//		by Aniruddha

//Define an integer stack interface
interface Stack
{
	void push (int item);	//store an item
	int pop();		//retrieve an item 
}

//An implementation of Stack that uses fixed storage
class FixedStack implements Stack
{
	private int stck[];
	private int tos;
	
	FixedStack(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	//push an item into the stack
	public void push(int item)	//The methods that implement an interface must be declared public
	{
		if (tos == stck.length-1)
			System.out.println("Stack Overload");
		else
		
			stck[++tos] = item;		
	}
	
	//pop an item from the stack
	public int pop()
	{
		if (tos<0)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else 
			return stck[tos--];
	}
}

//An implementation of Stack that uses growable storage
class DynStack implements Stack
{
	private int stck[];
	private int tos;
	
	DynStack(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	//push an item into the stack
	public void push(int item)
	{
		if (tos == stck.length-1)
		{
			int temp[] = new int [stck.length * 2];	//double size
			for(int i = 0;i< stck.length;i++)
				temp[i] = stck[i];
			stck = temp;	 
		}
		stck[++tos] = item;		
	}
	
	//pop an item from the stack
	public int pop()
	{
		if (tos<0)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else 
			return stck[tos--];
	}
}


class Interfaces
{
	public static void main(String args[])
	{	
		/*Testing Fixed Stack*/
		System.out.println("Testing Fixed Stack\n");
		FixedStack myFixedStack1 = new FixedStack(5);
		FixedStack myFixedStack2 = new FixedStack(10);
		
		//push some items into the stack
		for(int i=0;i<5;i++) myFixedStack1.push(i);
		for(int i=0;i<10;i++) myFixedStack2.push(100-i);
		
		//pop some items from the stack
		System.out.println("Stack in myFixedStack1 :");
		for(int i=0;i<5;i++) System.out.println(myFixedStack1.pop());
		System.out.println("Stack in myFixedStack2 :");
		for(int i=0;i<10;i++) System.out.println(myFixedStack2.pop());
		
		/*------------------------------------------------------------------*/
		for(int i=0;i<20;i++) System.out.print("-");
		
		/*Testing Dynamic Stack*/
		System.out.println("\nTesting Dynamic Stack\n");
		DynStack myDynStack1 = new DynStack(5);
		DynStack myDynStack2 = new DynStack(10);
		
		//push some items into the stack
		for(int i=0;i<12;i++) myDynStack1.push(i);
		for(int i=0;i<23;i++) myDynStack2.push(100-i);
		
		//pop some items from the stack
		System.out.println("Stack in myDynStack1 :");
		for(int i=0;i<12;i++) System.out.println(myDynStack1.pop());
		System.out.println("Stack in myDynStack2 :");
		for(int i=0;i<23;i++) System.out.println(myDynStack2.pop());
		
		
		/*------------------------------------------------------------------*/
		for(int i=0;i<20;i++) System.out.print("-");
		
		/*Create an interface variable & access stacks through it*/
		System.out.println("\nCreate an interface variable & access stacks through it\n");
		
		Stack myStack;	//Create an interface reference variable
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(10);
		
		
		myStack = ds ; 		//load dynamic stack
		//push some items into the stack
		for(int i=0;i<12;i++) myStack.push(i);
		
		myStack = fs ; 		//load fixed stack
		//push some items into the stack
		for(int i=0;i<10;i++) myStack.push(i);
		
		myStack = ds ; 		//load dynamic stack
		//pop some items from the stack
		System.out.println("Values in Dynamic Stack :");
		for(int i=0;i<12;i++) System.out.println(myStack.pop());
		
		myStack = fs ; 		//load fixed stack
		//pop some items from the stack
		System.out.println("Values in Fixed Stack :");
		for(int i=0;i<10;i++) System.out.println(myStack.pop());
		
		
	}
}

/*Sample Output
Testing Fixed Stack

Stack in myFixedStack1 :
4
3
2
1
0
Stack in myFixedStack2 :
91
92
93
94
95
96
97
98
99
100
--------------------
Testing Dynamic Stack

Stack in myDynStack1 :
11
10
9
8
7
6
5
4
3
2
1
0
Stack in myDynStack2 :
78
79
80
81
82
83
84
85
86
87
88
89
90
91
92
93
94
95
96
97
98
99
100
--------------------
Create an interface variable & access stacks through it

Values in Dynamic Stack :
11
10
9
8
7
6
5
4
3
2
1
0
Values in Fixed Stack :
9
8
7
6
5
4
3
2
1
0

*/
