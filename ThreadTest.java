public class ThreadTest
{
	public static void main(String args[])
	{
		DispThread dt1 = new DispThread("Hello");
		DispThread dt2 = new DispThread("World");
		Thread t1 = new Thread(dt1);
		Thread t2 = new Thread(dt2);
		t1.start();
		t2.start();
	}
}
// class DispThread extends Thread
// {
// 	String msg;
// 	public void run()
// 	{
// 		for(int i=0;i<10;i++)
// 		System.out.println(msg);
// 	}
// 	public DispThread(String msg)
// 	{
// 		this.msg = msg;
// 	}
// }
class DispThread implements Runnable
{
	String msg;
	public void run()
	{
		for(int i=0;i<10;i++)
		System.out.println(msg);
	}
	public DispThread(String msg)
	{
		this.msg = msg;
	}
}