import java.util.*;
public class DecToBin
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		long dec = sc.nextLong();
		int t = (int)(Math.log(dec)/Math.log(2));
		int arr[] = new int[t+1];
		Arrays.fill(arr,0);
		// System.out.print(t);
		long temp=0;
		 while(dec!=0)
		 {
		 	arr[t]=1;
		 	temp = (long)Math.pow(2,t);
		 	dec -=temp;
		 	t = (int)(Math.log(dec)/Math.log(2));
		}
		for(int i=arr.length;i>0;i--)
			System.out.print(arr[i-1]);
	}
}