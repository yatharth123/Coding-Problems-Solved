import java.util.*;
public class Collatz
{
	static Map<Long,Long> m = new HashMap<Long, Long>();

	static long countChain(long n)
	{
		if(m.containsKey(n))
			return  m.get(n);
		if(n%2==0)
			m.put(n,1+countChain(n/2));
		else
			m.put(n,2+countChain((3*n+1)/2));
		return m.get(n);
	}
	public static void main(String args[])
	{
		long longest_chain = 0;
		long ans = -1;
		m.put(1L,1L);
		for(long i = 500000;i<1000000;++i)
		{
			if(countChain(i) > longest_chain)
			{
				longest_chain = countChain(i);
				ans = i;
			}
		}
		System.out.println(ans);
	}
}