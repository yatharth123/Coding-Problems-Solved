import myFastReader.FastReader;
import java.math.BigInteger;
public class SummationofPrimes
{
	public static boolean isaPrime(long a)
	{
		long r = (long)Math.floor(Math.sqrt(a));
		if(a==1) return false;
		if(a<4) return true;
		if(a%2==0) return false;
		if(a<9) return true;
		if(a%3==0) return false;
		long i=5;
		for(;i<=r;i+=6)
		{
			if(a%i==0) return false;
			if(a%(i+2)==0) return false;
		}
		return true;
	}
	public static void getSum()
	{
		long limit= 2000000;
		// System.out.println((int)(limit-1)/2+" "+(limit-1)/2);
		int sievebound = (int)(limit-1)/2;
		int crosslimit = ((int)Math.sqrt(limit)-1)/2;
		boolean sieve[] = new boolean[sievebound+1];
		for(int i=1;i<=crosslimit;i++)
		{
			if(!sieve[i])
			{
				for(int j=2*i*(i+1);j<=sievebound;j+=(2*i+1))
				{
					// System.out.println(j);
					sieve[j] = true;
				}
			}
		}
		int sum=2;
		for(int i=1;i<=sievebound;i++)
			if(!sieve[i])sum+=(2*i+1);
		System.out.println(sum);
	}
	public static void main(String args[])
	{
		BigInteger sum=new BigInteger(Integer.toString(5));
		getSum();
		for(long i=5;i<2*Math.pow(10,6);i+=6)
		{
			if(isaPrime(i))
			sum = sum.add(new BigInteger(Long.toString(i)));
            if((i+2)<2*Math.pow(10,6)&&isaPrime(i+2))
            {
            	sum = sum.add(new BigInteger(Long.toString(i+2)));
            }
		}
		// System.out.println(sum);
	}
}