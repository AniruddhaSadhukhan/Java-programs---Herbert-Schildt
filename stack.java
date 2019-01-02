
//Program to implement stack
//		by Aniruddha

class Stack
{
	private int stck[];
	private int tos;
	
	Stack(int size)
	{
		stck = new int[size];
		tos = -1;
	}
	
	//push an item into the stack
	void push(int item)
	{
		if (tos == stck.length-1)
			System.out.println("Stack Overload");
		else
		
			stck[++tos] = item;		
	}
	
	//pop an item from the stack
	int pop()
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
class stack
{
	public static void main(String args[])
	{	
		Stack myStack1 = new Stack(5);
		Stack myStack2 = new Stack(10);
		
		//push some items into the stack
		for(int i=0;i<5;i++) myStack1.push(i);
		for(int i=0;i<10;i++) myStack2.push(100-i);
		
		//pop some items from the stack
		System.out.println("Stack in myStack1 :");
		for(int i=0;i<5;i++) System.out.println(myStack1.pop());
		System.out.println("Stack in myStack2 :");
		for(int i=0;i<10;i++) System.out.println(myStack2.pop());
		
		//These statements are not legal
		//myStack1.tos = -2;
		//myStack2.stck[3] = 100;
		
	}
}

/*Sample Output
Stack in myStack1 :
4
3
2
1
0
Stack in myStack2 :
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

*/
