import java.io.*;
import java.util.*;
public class PrimeGenerator
{
	public static void simpleSieve(int upper,int lower)
	{
		int limit=(int)Math.sqrt(upper)+1;
		
		boolean mark[] = new boolean[upper+1];
		//System.out.println("ys");
		Arrays.fill(mark,true);
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		for(int i=2;i<=limit;i++)
		{	
			//System.out.println("ys");
			
			if(mark[i]==true)
			{
				prime.add(i);
				//System.out.println("ys");
				for(int p=i*i;p<=limit;p=p+i)
				{
					//System.out.println("ys"+limit);	
					mark[p]=false;
				}
			}
		}
		
		for(Integer pr : prime)
		{
			for(int i=lower;i<=upper;i++)	
			{
				//System.out.println("ys");
				if(i%pr==0&&i>pr)
					mark[i]=false;
			}			
		}
		for(int i=lower;i<=upper;i++)
		{
			if(i==1||i==0)
				continue;
			if(mark[i]==true)
				System.out.println(i);
		}
	}


	public static void main(String args[])
	{	
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++)
		{
			int l=sc.nextInt();
			int u =sc.nextInt();	
			simpleSieve(u,l); 		
		}		
	}
}