import java.util.*;
public class ChefBDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int d=0,i=0,key=-1;
		
		String n= new String();
		StringBuffer sb = new StringBuffer("");

		while(t-->0)
		{
			i=0;
			key = -1;
			n = sc.next();
			d = sc.nextInt();
			int a[] = new int[n.length()];
			while(i<n.length())
			{
				a[n.length()-i-1] = (int)(n.charAt(i)-'0');
				
				// System.out.println(a[i]);
				++i;
			}
			n = "";
			// System.out.println(d);
			for(int j=0;j<i;++j)
			{
				if(key>-1)
				{
					if(a[key]<a[j]){
					a[j] = -1;
					// a[key] = d;
					}
					else if(a[key]>a[j])
					{
						key = j;
					}
				}

				else if(a[j]<d)
				{
					key = j;
				}
				else
				{
					a[j] = d;
				}
				//System.out.println(key);
			}
			key = 0;
			while(i-->0)
			{
				if(a[i]>0)
				n += (char)((int)'0'+a[i]);
				else
				// {	System.out.println(a[i]);
					key+=1;
				// }
			}
			// System.out.println(key);
			// System.out.println(n);
			while(key-->0)
				n += (char)((int)'0'+ d);
			sb.append(n+"\n");
		}
		System.out.println(sb.toString());
	}
}