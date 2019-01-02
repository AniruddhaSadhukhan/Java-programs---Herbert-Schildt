
//Program to Create Thread by Implementing Runnable
//		by Aniruddha

class NewThread implements Runnable
{
	Thread t;
	
	NewThread()
	{
		t = new Thread(this,"My Thread");
		System.out.println("Child Thread : "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println("Child Thread: "+i);
				t.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("Child Interrupted");
		}
		System.out.println("Exiting Child Thread");
	}
}


class CreatingThreadImplementingRunnable
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
