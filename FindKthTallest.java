import java.util.Scanner;
public class FindKthTallest
{
	static int ft[] = new int[100005];
	public static void update(int ind, int val)
	{
		for(;ind<ft.length;ind += Integer.lowestOneBit(ind))
			ft[ind] += val;
	}
	static int search(int k,int max)
	{
		int u = 2*(max+Integer.lowestOneBit(max)), l=0,mid=0;
		while(l<u)
		{
			mid = (l+u)/2;
			// System.out.println("value at mid = "+ft[mid]+" mid = "+mid);
			if(ft[mid]==k)
				return mid;
			if(ft[mid]>k)
				u = mid;
			else if(ft[mid]<k)
			{
				k -= ft[mid];
				l = mid+1;
			}
		}
		// System.out.printf("u=%d , l = %d ,mid = %d, k = %d",u,l,mid,k);
		return l;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val[] = new int[n];
		for(int i=0;i<n;i++)
		{
			val[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			update(i+1,val[i]);
		}
		int k = sc.nextInt();
		// System.out.println("k = "+k);
		// if(k>ft[n]||k<=0)
		// {
		// 	System.out.println("Does not exist");
		// 	System.exit(0);
		// }
		int index = search(k,n);
		System.out.println(index+0);
	}
}