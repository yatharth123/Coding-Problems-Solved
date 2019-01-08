import java.util.*;
public class TripleStep
{
	static int arr[] = new int[1000]; 
	public static int solve(int n)
	{
		if(n<0)
			return 0;
		if(n==0)
		{
			return 1;
		}
		
		System.out.println(n+" "+arr[n]);
		if(arr[n] > 0)
			return arr[n];
			
		arr[n] = solve(n-1)+solve(n-2)+solve(n-3);
		return arr[n];
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = solve(n);
		// arr[0] = 0;
		// arr[1] = 1;
		// arr[2] = 2;
		// arr[3] = 3;
		System.out.println(count);
	}
}