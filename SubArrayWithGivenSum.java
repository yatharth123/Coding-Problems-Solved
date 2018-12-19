import java.util.*;

class SubArrayWithGivenSum {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n,s,st,end;
		boolean flag=false;
		long a[] = new long[10000003];
		double c;
		while(t-->0)
		{
		   st = 0;end = 0;c = 0;
		   flag = false;
		   n = sc.nextInt();
		   s = sc.nextInt();
		   for(int i=0;i<n;i++)
		   {
		       a[i] = sc.nextLong();
		       c += a[i];
		       
		       while(c>(double)s &&!flag){c -= a[st];st += 1;} //System.out.println(a[i]);
		       if(c==(double)s&&!flag)
		       { flag= true;end = i;}
		   }
		   if(flag)System.out.println((st+1)+" "+(end+1));
		   else System.out.println(-1);
		}
	}
}