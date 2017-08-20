import java.util.*;
import java.io.*;
import java.math.*;
public class BinProtoc
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger biN = sc.nextBigInteger();
		int a[] = new int[n];
		int b[] = new int[n];
		int i,j,k;
		j=0;
		for(i = 0;i<n;i++)
		{
			b[i] = 0;
		}
		/*for(i=(n-1);i>=0;i--)
		{
			a[i]=biN%10;
			biN = biN/10;
		}
		*/
		for(i = 0;i<n;i++)
		{
			if(biN.divide(BigInteger.TEN.pow(n-i-1)).equals(BigInteger.ONE))
				b[j] += 1;
			else if(biN.divide(BigInteger.TEN.pow(n-i-1)).equals(BigInteger.ZERO))
				j++;
			biN= biN.remainder(BigInteger.TEN.pow(n-i-1));

		//System.out.println(b[j]);

		}
		//if(a[i-1] ==0)
		//	j--;
		for(k=0;k<=j;k++)
			System.out.print(b[k]);
	}
}