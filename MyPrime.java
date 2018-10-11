import java.io.*;
import java.util.*;
public class MyPrime
{
	static int primeInBetween(int m,int n)
	{
		int sum=0;
		int arr[] = new int[n+1];
		for(int i=2;i<=n;i++)
		{
			arr[i]=0;
		}
		for(int i=2;i*i<=n;i++)
		{
			for(int p=i*2;p<=n;p+=i)
			{
				arr[p]=1;
				// System.out.println(p);
			}
		}
		for(int i=m;i<=n;i++)
		{
			if(arr[i]==0)
			{
				sum+=i;
				// System.out.println(i);
			}
		}

		return sum;
	}

	public static void main(String args[])
	{
		System.out.println(primeInBetween(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
	}
}