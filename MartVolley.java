import java.io.*;
import java.util.*;

public class MartVolley
{
	public static void main(String args[])
	{
		int k,x,y;
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
			k=sc.nextInt();
			x=sc.nextInt();
			y=sc.nextInt();
			if(x>y)
			{
				if(x<k)
				System.out.println(k-x);
				else if(x<(y+2))
				System.out.println(1);
				else
				System.out.println(0);
			}
			else if(y>x)
			{
				if(y<k)
				System.out.println(k-y);
				else if(y<(x+2))
				System.out.println(1);
				else
				System.out.println(0);
			}
			else if(x==y)
			{
				if(x<k)
				System.out.println(k-x);
				else
				System.out.println(2);
			}						
		}
	}
}
