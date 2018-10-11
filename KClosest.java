import java.io.*;
import java.util.*;
public class KClosest
{
	public static void main(String args[])
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

		System.out.println(sum);
	}
}