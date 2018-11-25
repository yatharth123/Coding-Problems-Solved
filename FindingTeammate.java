/*package whatever //do not write package name here */

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
class FindingTeammate{
    public static long fact(long n)
    {
        if(n<=1) return 1;
        return n*fact(n-1);
    }
	public static void main (String[] args) {
		long arr[] = new long[1000000];
		arr[0]=1;
		arr[1]=1;
		int j=0;
		long temp=(long)Math.pow(10,9)+7;
		for(int i=2;i<arr.length;i++)
		{
			if(i%2==0)j=i-1;
			else j=i;
			arr[i]=(arr[i-2]*j)%temp;
		}
		ArrayList<Long> al=new ArrayList<Long>();
		int t = sc.nextInt();
		long options;
		while(t>0)
		{
		    options=1;
		    al.clear();
		    int n = sc.nextInt();
		    long ar[] =new long[n];
		    for(int i=0;i<n;i++)ar[i]=sc.nextInt();
		    Arrays.sort(ar);
		    long count=1;
		    
		    for(int i=n-2;i>=0;i--)
		    {
		        if(ar[i]!=ar[i+1])
		        {
		            al.add(count);
		            count=0;
		        }
		        count++;
		    }
		    al.add(count);
		  //  for(Integer x:al)System.out.print(x+" ");
		  //  System.out.println();
		  //  System.out.println(temp);
		  for(int i=0;i<al.size();i++)
		  {
		      long x=al.get(i);
		      //System.out.println(choices);
		      if(x>0)
		      {
		          if(x%2==0)
		          options=(options%temp*arr[x])%temp;
		      
		        if(x%2!=0&&(i+1)<al.size())
		        {
		            
		            options=(options%temp*arr[x]*al.get(i+1)%temp)%temp;
		            al.set(i+1,al.get(i+1)-1);
		      	}
		      }
		      options=options%temp;
		  }
		  System.out.println(options);
		    t--;
		}
	}
}
class Scanner
{
	private BufferedReader br;
	private StringTokenizer st;
	public Scanner(InputStream in)
	{
		br = new BufferedReader(new InputStreamReader(in));
	}
	public String next()
	{
		try{
			while(st==null || !st.hasMoreTokens())
			{
				st = new StringTokenizer(br.readLine());
			}
		catch(IOException e){ e.printStackTrace();}
		return st.nextToken();
	}
	public int nextInt()
	{
		return Integer.parseInt(next());
	}
	public long nextLong()
	{
		return Long.parseLong(next());
	}
	public double nextDouble()
	{
		return Double.parseDouble(next());
	}
	public String nextLine()
	{
		String str="";
		try
		{
			str = br.readLine();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return str;
	}
}