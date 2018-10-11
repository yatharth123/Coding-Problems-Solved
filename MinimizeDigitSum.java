import java.util.*;
public class MinimizeDigitSum
{
	public static long digitSum(long n)
	{	
		long rem=0;
		while(n!=0)
		{
			rem+=(int)n%10;
			n=n/10;
		}
		return rem;
	}
	public static long addD(long n,long d)
	{
		return n+d;
	}
	public static void main(String args[])
	{
		//FastReader sc = new FastReader();
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0;i<t;i++)
		{
			long n,d;
			n= sc.nextLong();
			d= sc.nextLong();
			
		}
	}
}