
//Program to Create Multiple Threads by Implementing Runnable
//		by Aniruddha

class NewThread implements Runnable
{
	String name;
	Thread t;
	
	NewThread(String ThreadName)
	{
		name = ThreadName;
		t = new Thread(this,ThreadName);
		System.out.println("New Child Thread : "+t);
		t.start();
	}
	
	public void run()
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + " : "+i);
				t.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " Interrupted");
		}
		System.out.println("Exiting Thread: " + name);
	}
}


class CreatingMultipleThreads
{
	public static void main(String args[])
	{	
		new NewThread("One");
		new NewThread("Two");
		new NewThread("Three");
		
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
One : 5
New Child Thread : Thread[Two,5,main]
New Child Thread : Thread[Three,5,main]
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
