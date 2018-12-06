import java.util.Scanner;
public class Count_inv
{
	static int b[];
	public static void update(int i)
	{
		for(int j = i;j<b.length;j+=Integer.lowestOneBit(j))
			b[j] +=1;
	}
	static int runningSum(int x,int max)
	{
		// System.out.println("For: "+x);
		int sum=0;
		for(int i=max;i>0;i-= Integer.lowestOneBit(i))
		{	
			sum +=  b[i];
			// System.out.print("Corresponding to "+i+" sum= "+sum+"\n\n");
		}
		// System.out.println("Before Subtracting: "+sum);
		for(int i=x;i>0;i -= Integer.lowestOneBit(i))
		{
			sum -= b[i];
			// System.out.print(sum+" ");
		}
		// System.out.println("After Subtracting: "+sum);
		return sum;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = 0,sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			if(max<arr[i])
				max = arr[i];
		}
		b = new int[max+1];
		for(int i=0;i<n;i++)
		{
			sum += runningSum(arr[i],max);
			update(arr[i]);
			// System.out.println("After Updation: "+arr[i]+" = "+b[arr[i]]);
			// System.out.print(sum+((i!=(n-1))?" + ":"\n"));
		}
		System.out.println(sum);
	}
}