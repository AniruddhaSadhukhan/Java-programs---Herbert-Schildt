
//Program to understand Synchronized Statement
//		by Aniruddha

class Callme
{
	void call(String name)
	{
		try
		{
			for(int i=5;i>0;i--)
			{
				System.out.println(name + " : "+i);
				Thread.currentThread().sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(name + " Interrupted");
		}
	}
}

class NewThread implements Runnable
{
	String name;
	Thread t;
	Callme target;
	
	NewThread(Callme tar,String ThreadName)
	{
		name = ThreadName;
		target = tar;
		t = new Thread(this,ThreadName);
	}
	
	/* 	
		synchronized(object)
		{
			//statements to be synchronized
		}
	--> object is a reference to the object being synchronized.
	A synchronized block ensures that a call to a method 
	that is a member of object occurs only after the 
	current thread has succesfully entered object's monitor
	*/
	
	
	public void run()
	{
		System.out.println("Starting Thread: " + name);
		
		synchronized(target)	//synchronized block
		{
			target.call(name);
		}

		System.out.println("Exiting Thread: " + name);
	}
}


class sync_statement
{
	public static void main(String args[])
	{	
		Callme targ = new Callme();
		
		NewThread a = new NewThread(targ,"One");
		NewThread b = new NewThread(targ,"Two");
		NewThread c = new NewThread(targ,"Three");
		
		System.out.println("New Child Thread : "+a.t);
		System.out.println("New Child Thread : "+b.t);
		System.out.println("New Child Thread : "+c.t);
		
		a.t.start();
		b.t.start();
		c.t.start();
		
		try
		{
			//wait for other threads to end
			a.t.join();
			b.t.join();
			c.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		System.out.println("Exiting Main Thread");
	}
}

/*Sample Output without synchronized block:
Starting Thread: One
One : 5
Starting Thread: Two
Two : 5
Starting Thread: Three
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
Exiting Thread: Three
Exiting Thread: Two
Exiting Main Thread
*/

/*Sample Output with synchronized block:
New Child Thread : Thread[One,5,main]
New Child Thread : Thread[Two,5,main]
New Child Thread : Thread[Three,5,main]
Starting Thread: One
One : 5
Starting Thread: Two
Starting Thread: Three
One : 4
One : 3
One : 2
One : 1
Three : 5
Exiting Thread: One
Three : 4
Three : 3
Three : 2
Three : 1
Exiting Thread: Three
Two : 5
Two : 4
Two : 3
Two : 2
Two : 1
Exiting Thread: Two
Exiting Main Thread

*/
