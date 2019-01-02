
//Program to Create Multiple Threads by Extending Thread Class
//		by Aniruddha

class NewThread extends Thread
{
	String name;
	
	NewThread(String s)
	{
		super(s);
		System.out.println("New Child Thread : "+this);
		name = s;
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + " : "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " Interrupted");
		}
		System.out.println("Exiting Thread: " + name);
	}
}


class CreatingMultipleThreadsExtendingThreadClass
{
	public static void main(String args[])
	{	
		NewThread n1 = new NewThread("One");
		NewThread n2 = new NewThread("Two");
		NewThread n3 = new NewThread("Three");
		
		n1.start();
		n2.start();
		n3.start();
		
		try
		{
			Thread.sleep(10000); //wait for other threads to end
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
		
	}
}

/*Sample Output
New Child Thread : Thread[One,5,main]
New Child Thread : Thread[Two,5,main]
New Child Thread : Thread[Three,5,main]
One : 5
Two : 5
Three : 5
One : 4
Two : 4
Three : 4
One : 3
Two : 3
Three : 3
One : 2
Two : 2
Three : 2
One : 1
Two : 1
Three : 1
Exiting Thread: One
Exiting Thread: Two
Exiting Thread: Three
Exiting Main Thread

*/
