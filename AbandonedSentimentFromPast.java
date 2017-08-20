import java.util.*;
import java.io.*;
public class AbandonedSentimentFromPast
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arrA[]=new int[a];
		int b=sc.nextInt();
		int arrB;
		for(int i=0;i<a;i++)
		{
			arrA[i]=sc.nextInt();
		}
			arrB=sc.nextInt();
		for(int i=1;i<b;i++)
		{
			int temp=sc.nextInt();
		}
		if(b>1||checkNotIncreasing(arrA,arrB))
		{
			System.out.println("Yes");
		}
		else 
		{
			System.out.println("No");
		}
	}
	public static boolean checkNotIncreasing(int arr[],int n)
	{
		if(arr[0]==0)
			arr[0]=n;
		for(int i=0;i<(arr.length-1);i++)
	 	{
			if(arr[i+1]==0)
			{
				arr[i+1]=n;
			}
			if(arr[i]>arr[i+1])
				return true;
		}
		return false;
	}
}
