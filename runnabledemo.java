class A implements Runnable
{
public void run()
{
	try{
for(int i=0;i<10;i++)
{
	if(i%2==0)
	{	System.out.println("Even no "+ i);
	Thread.sleep(500);
	}
}
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}	
}
class B  implements Runnable
{
	Thread t;
	B()
	{
		t=new Thread(this);
		t.start();
		
	}
public void run()
{
try{
for(int i=0;i<10;i++)
{
	if(i%2!=0)
	{	System.out.println("Odd no "+ i);
	Thread.sleep(500);
	}
}
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	}	
}	

class runnabledemo
{
public static void main(String args[])
{
new Thread(new A()).start();
new B();

}
}

// public static void sleep(long millisecond) throws InterruptedException