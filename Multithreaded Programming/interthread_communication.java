
//Program to understand interthread communication
//		by Aniruddha

class Q 
{
	int n;
	boolean valueSet = false;
	
	synchronized void put(int i)
	{
		if (valueSet)
			try
			{
				wait();
			}
			catch (Exception e)
			{
				System.out.println("Exception: "+e);	
			}
		this.n = i;
		System.out.println("Put : "+n);
		valueSet = true;
		notify();
	}
	
	synchronized void get()
	{
		if (!valueSet)
			try
			{
				wait();
			}
			catch (Exception e)
			{
				System.out.println("Exception: "+e);	
			}
		System.out.println("Got : "+n);
		
		if(this.n==10) 
			return;
		valueSet = false;
		notify();
	}
}

class Producer implements Runnable
{
	Q obj;
	volatile boolean status = true;
	
	Producer(Q ob)
	{
		this.obj = ob;
		new Thread(this,"Producer").start();
	}
	
	public void run()
	{
		int i = 0;
		while(status)
		{
			obj.put(i++);
			if(obj.n==10)
				status = false;
		}
		System.out.println("Exiting Producer");		
	}
}

class Consumer implements Runnable
{
	Q obj;
	volatile boolean status = true;
	
	Consumer(Q ob)
	{
		this.obj = ob;
		new Thread(this,"Consumer").start();
	}
	
	public void run()
	{
		while(status)
		{
			obj.get();
			if(obj.n==10)
				status = false;
		}
		System.out.println("Exiting Consumer");		
	}
}

class interthread_communication
{
	public static void main(String args[])
	{	
		
		Q ob = new Q();
		
		Producer x = new Producer(ob);
		Consumer y = new Consumer(ob);
		
		try
			{
				Thread.sleep(1000);
			}
			catch (Exception e)
			{
				System.out.println("Exception: "+e);	
			}
		System.out.println("Exiting Main");		
			
	}
}

/*Sample Output without wait and notify
Put : 0
Put : 1
Put : 2
Put : 3
Put : 4
Put : 5
Put : 6
Put : 7
Put : 8
Put : 9
Put : 10
Exiting Producer
Got : 10
Exiting Consumer
Exiting Main

*/

/*Sample Output with wait and notify
Put : 0
Got : 0
Put : 1
Got : 1
Put : 2
Got : 2
Put : 3
Got : 3
Put : 4
Got : 4
Put : 5
Got : 5
Put : 6
Got : 6
Put : 7
Got : 7
Put : 8
Got : 8
Put : 9
Got : 9
Put : 10
Got : 10
Exiting Consumer
Exiting Producer
Exiting Main

*/
