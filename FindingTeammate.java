/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
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
		      
		      long choices=((x%temp)*((x-1)%temp)/2)%temp;
		      if(choices==0)
		          choices=1;
		      if(x%2!=0&&i<(al.size()-1))
		      {
		          choices= (choices%temp*al.get(i+1)%temp)%temp;
		          //System.out.println(choices);
		          al.set(i+1,al.get(i+1)-1);
		      }
		      if(choices>1)
		        options = (options%temp*choices%temp)%temp;
		      //System.out.print(options+" ");
		  }
		  System.out.println(options);
		    t--;
		}
	}
}