import myFastReader.FastReader;
public class PythagoreanTriplet
{
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		// Brute methodology
		//
		// for(int i=1;i<1000;i++)
		// {
		// 	for(int j=i+1;j<1000;j++)
		// 	{
		// 		for(int k=j+1;k<1000;k++)
		// 		{
		// 			if((i*i+j*j)==(k*k)&&(i+j+k)==1000)
		// 			{
		// 				System.out.println(i*j*k);
		// 				break;
		// 			}
		// 		}
		// 	}
		// }

		//using Euclids formula
		int s=1000;
		for(int m=1;m<s;m++)
		{
			for(int n=1;n<m;n++)
			{
				int a=m*m-n*n;
				int b=2*m*n;
				int c= m*m+n*n;
				if((a+b+c)==s)
				{
					int k= s/(a+b+c);
					// k will be equal to 1
					// System.out.println(k);
					System.out.println(k*k*k*a*b*c);
					break;
				}
			}
		}
	}
}