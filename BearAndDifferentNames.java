import myFastReader.FastReader;
public class BearAndDifferentNames
{
	public static String genName(int i)
	{
		return (char) ('A'+i/26) + "" + (char)('a'+i%26);
	}

	public static void main(String args[])
	{
		FastReader in = new FastReader();
		int n = in.nextInt();
		int k = in.nextInt();
		boolean[] repeat = new boolean[n];
		for(int i=k-1;i<n;++i)
		{
			repeat[i] = in.next().equals("NO");
		}
		String names[] = new String[n];
		
		for(int i=0;i<n;++i)
		{
			if(i>0)
				System.out.print(" ");
			if(repeat[i])
				names[i] = names[i - k + 1];
			else{
				names[i] = genName(i);
			}
			System.out.print(names[i]);
		}
	}
}