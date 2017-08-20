import java.io.*;
import java.util.*;

public class LastManStanding
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();//no. of players
		int nkilled=0;//total no. of players killed
		int a[]= new int[n];//the killings of each player
		int i;
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			nkilled+=a[i];
		}
		if(nkilled>=n)
			System.out.println("NO");
		else
		{
			i--;
			int b[]=new int[nkilled];//the index of players who made the kills(with repeated values)
			int j=0;
			System.out.println("YES");
			while(i>=0)
			{
				if(a[i]!=0)
				{
					b[j]=i+1;
					a[i]--;
					j++;
				}
				if(a[i]==0)
				i--;
			}
			for(i=0;i<nkilled;i++)
			{
				System.out.println(b[i]+" "+(n-i));
			}	
		}
	}
}