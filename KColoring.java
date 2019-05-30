// Array K-Coloring
import java.util.*;

public class KColoring
{
	static int a[] = new int[5005];
	static int b[] = new int[5005];
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int max=  0;
		boolean flag = true;
		for(int i=0;i<n;i++)
		{	
			a[i] = sc.nextInt();
			if(max<a[i])
				max = a[i];
		}
		// if(max<= k) flag = false;
		for(int i=0;i<n;i++)
		{
			b[a[i]]++;
			if(b[a[i]]>k) flag = false;
			a[i] = b[a[i]];
			// System.out.print(b[a[i]]);
		}
		// System.out.println();
		if(flag)
		{
			System.out.println("YES");
			for(int i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
		else System.out.println("NO");
	}
}