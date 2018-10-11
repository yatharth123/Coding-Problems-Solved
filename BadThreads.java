public class BadThreads
{
	static String message;

	private static class CorrectorThread extends Thread
	{
		public void run(){
			try{
				sleep(1000);
			}catch(InterruptedException e){}
			// statement 1
			message = "Mares do eat oats";
		}
	}
	public static void main(String args[])throws InterruptedException
	{
		(new CorrectorThread()).start();
		message = "Mares do not eat oats.";
		Thread.sleep(1000);
		// statement 2
		// for(int i=0;i<10;i++)
		System.out.println(message);
	}
}