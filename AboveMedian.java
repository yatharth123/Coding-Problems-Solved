import java.util.Arrays;
import java.util.Scanner;

public class AboveMedian
{
	static int arr[] = new int[1000];
	static int temp[] = new int[1000];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int count = 0;
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
			temp[i] = arr[i];
		}
		for(int i= 0 ;i<n;i++)
		{
			for(int j = 0;j<n-i;j++)
			{
				Arrays.sort(temp,i,j+i+1);
				// System.out.println("Set ={ ");
				// for(int k=i;k<=j+i;k++)
				// 	System.out.print(temp[k]+" ");
				// System.out.println("}\n Median = "+((int)Math.ceil((double)(j-i)/2)+i));

				if(temp[((int)Math.ceil((double)(j)/2)+i)]>=x)
				{
					// System.out.println("i = "+i+" j = "+j+" temp["+((int)Math.ceil((double)(j-i)/2)+i)+"] = "+temp[(int)Math.ceil((double)(j-i)/2)+i]);
					count++;
					// System.out.println(1);
				}
			}
			for(int j= 0;j<n;j++)
			{
				temp[j] = arr[j];
			}
		}
		System.out.println(count);
	}
}