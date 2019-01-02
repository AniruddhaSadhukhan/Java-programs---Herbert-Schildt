
//Program to understand the use of isAlive() & join()
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


class isAlive_join
{
	public static void main(String args[])
	{	
		NewThread ob1 = new NewThread("One");
		NewThread ob2 = new NewThread("Two");
		NewThread ob3 = new NewThread("Three");
		
		
		System.out.println("Thread: " +ob1.t +" is alive : "+ob1.t.isAlive());
		System.out.println("Thread: " +ob2.t +" is alive : "+ob2.t.isAlive());
		System.out.println("Thread: " +ob3.t +" is alive : "+ob3.t.isAlive());
		
		
		try
		{
			System.out.println("Waiting for other threads to end");
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("Main Thread Interrupted");
		}
		
		
		System.out.println("Thread: " +ob1.t +" is alive : "+ob1.t.isAlive());
		System.out.println("Thread: " +ob2.t +" is alive : "+ob2.t.isAlive());
		System.out.println("Thread: " +ob3.t +" is alive : "+ob3.t.isAlive());
		
		
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
Thread: Thread[One,5,main] is alive : true
Thread: Thread[Two,5,main] is alive : true
Thread: Thread[Three,5,main] is alive : true
Waiting for other threads to end
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
Thread: Thread[One,5,] is alive : false
Thread: Thread[Two,5,] is alive : false
Thread: Thread[Three,5,] is alive : false
Exiting Main Thread

*/
