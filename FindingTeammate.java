/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class FindingTeammate{
    public static long fact(long n)
    {
        if(n<=1) return 1;
        return n*fact(n-1);
    }
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Long> al=new ArrayList<Long>();
		int t = sc.nextInt();
		long temp=(long)Math.pow(10,9)+7,options;
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
		          options=(options%temp*(fact(x)/(((long)Math.pow(2,x/2))*fact(x/2))%temp))%temp;
		      
		        if(x%2!=0&&(i+1)<al.size())
		        {
		            
		            options=(((options%temp)*(fact(x+1)/(((long)Math.pow(2,(x+1)/2))*fact((x+1)/2))%temp))%temp*al.get(i+1)%temp)%temp;
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