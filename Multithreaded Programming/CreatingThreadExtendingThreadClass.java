
//Program to Create Thread by Extending Thread Class
//		by Aniruddha

class NewThread extends Thread
{

	NewThread()
	{
		super("My Thread");
		System.out.println("Child Thread : "+this);
		start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}


class CreatingThreadExtendingThreadClass
{
	public static void main(String args[])
	{	
		new NewThread();
		
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread: "+i);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
}

/*Sample Output
Child Thread : Thread[My Thread,5,main]
Main Thread: 0
Child Thread: 5
Child Thread: 4
Main Thread: 1
Child Thread: 3
Child Thread: 2
Main Thread: 2
Child Thread: 1
Exiting Child Thread
Main Thread: 3
Main Thread: 4
Exiting Main Thread

*/
