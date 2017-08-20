import java.io.*;
import java.util.*;
public class Credit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int credit=sc.nextInt();
		int noi=sc.nextInt();
		int values[]=new int[noi];
		for(int i=0;i<noi;i++)
		{
			values[i]=sc.nextInt();
		}
		for(int i=0;i<noi-1;i++)
		{
			for(int j=i+1;j<noi;j++)
			{
				if((values[i]+values[j])==credit){
					System.out.println((i+1)+" "+(j+1));
					break;
				}
			}
		}
	}
}