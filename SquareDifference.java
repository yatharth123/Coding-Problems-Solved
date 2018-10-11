import myFastReader.FastReader;
public class SquareDifference
{
	public static boolean isPrime(long n)
	{
		if(n==1)	return false;
		if(n<4)		return true;
		if(n%2==0||n%3==0)	return false;
		if(n<9)		return true;
		long i=5;
		long r= (long)Math.sqrt(n);
		while(i<=r)
		{
			if(n%i==0)	return false;
			if(n%(i+2)==0) return false;
			i+=6;
		}
		return true;
	}
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		int t= sc.nextInt();
		long a,b,diff;
		for(int i=0;i<t;i++)
		{
			long area=0;
			a = sc.nextLong();
			b = sc.nextLong();
			diff = a-b;
			area = 2*diff*a-diff*diff;
			if(isPrime(area))
			{
				System.out.println("YES"+" "+area);
			}
			else
				System.out.println("NO"+" "+area);
		}
	}
}