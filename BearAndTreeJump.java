import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class BearAndTreeJump
{
	int k;
	class Vertex
	{
		List<Integer> adj= new ArrayList<>();
		long answer = 0;
		int[] count = new int[k];
		long[] sumWhole = new long[k];

		public void solve(Vertex parent)
		{
			++count[0];
			for(Vertex v:adj)
			{
				if(v==parent) continue;
				v.solve(this);
				answer	+=v.answer;
				for (int oldrem = 0;oldrem<k;++oldrem)
				{
					for(int newrem = 0;newrem<k;++newrem)
					{
						answer += sumWhole[oldrem] * sumWhole[newrem];
						int rem = oldrem + newrem + 1;
						answer+= count[oldrem] * (long)v.count[newrem] * ((rem + k - 1) / k);
					}
				}
				for (int newrem = 0; newrem < k; ++newrem){
					int rem	= (newrem + 1);
					count[rem%k] += v.count[newrem];
					sumWhole[rem %k] += v.sumWhole[newrem];
					if(rem >= k)
					{
						sumWhole[rem % k] += v.count[newrem];
					}
				}
			}
		}
	}
	
	public static void main(String args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		k = in.nextInt();
		Vertex[] v = new Vertex[n];
		for(int i=0;i<n;++i)
			v[i] = new Vertex();
		for(int i=0;i<n-1;i++)
		{
			Vertex a = v[in.nextInt()-1];
			Vertex b = v[in.nextInt()-1];
			a.adj.add(b);
			b.adj.add(a);
		}
		v[0].solve(null);
		System.out.println( v[0].answer );
	}
}