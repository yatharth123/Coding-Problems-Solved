import java.util.ArrayList;
import java.util.Scanner;
public class DisneyLand
{
	static String count_seats(ArrayList<Integer> al[])
	{
		int a=0,b=0,c=0,wona=0,wonb=0,wonc=0;
		for(int i=0;i<al.length;i++)
		{
			a=0;
			b=0;
			c=0;
			for(int j=0;j<al[i].size();j++)
			{
				// System.out.println("In constituency:"+i+" "+al[i].get(j));
				if(al[i].get(j)==1)
					a++;
				else if(al[i].get(j)==2)
					b++;
				else c++;
			}
			if(a>b&&a>c)wona++;
			if(b>a&&b>c)wonb++;
			if(c>a&&c>b)wonc++;
		}
		if(wona>wonb&&wona>wonc)
			return "AAA:"+Integer.toString(wona);
		if(wonb>wona&&wonb>wonc)
			return "BBB:" + Integer.toString(wonb);
		if(wonc>wona&&wonc>wonb)
			return "Others:"+Integer.toString(wonc);
		// if(wona==wonb&&wona>wonc||wona==wonc&&wona>wonb||wonb==wonc&&wonb>wona) 
		return "No Majority";
	}
	public static void main(String args[])
	{

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		//k*b*b = m*n && b<m && b<n where k is any integer

		int b = Math.min(m,n)-1;
		while((m*n)%(b*b) != 0)
			b--;
		
		ArrayList<Integer> a[] = new ArrayList[b*b];
		for(int i=0;i<b*b;i++)
			a[i] = new ArrayList<Integer>();
		
		int temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				temp = sc.nextInt();
				a[b*(i/b)+j/b].add(temp);
				// System.out.println("In constituency:"+(b*(i/b)+j/b));
			}
		}
		String s = count_seats(a);
		// if(s.equals("No Majority"))
		// 	System.out.println("No Majority");
		// else
			System.out.println("Initial Majority Party: Seats = "+s);
		int o = sc.nextInt();
		int i=0,j=0;
		for(int k=0;k<o;k++)
		{ 
			i = sc.nextInt()-1;
			j = sc.nextInt()-1;
			temp = sc.nextInt();
			a[b*(i/b)+j/b].set(b*(i%b)+j%b,temp);
		}
		s = count_seats(a);
		// if(s.equals("No Majority"))
		// 	System.out.println("No Majority");
		// else
			System.out.println("Party Won Party:Seats "+s);
	}
}