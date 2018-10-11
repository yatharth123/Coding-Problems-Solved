import myFastReader.*;
public class Prob11
{
	public static void main(String args[])
	{
		FastReader sc = new FastReader();
		int arr[][] = new int [20][20];
		for(int i=0;i<20;i++)
		{
			for(int j=0;j<20;j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		long prod_row=0,prod_col=0;
		//for row
		for(int k=0;k<20;k++)
		{
			for(int i=0;i<20;i++)
			{
				if(i<17)	
				{
					long prod=1;int j;
					for(j=0;j<4;j++)
					{
						if(prod==0)
							break;
						prod*=arr[k][i+j];
					}
					if(prod>prod_row&&j==4)
					{
						prod_row = prod;
					}
				}
				if(k<17)
				{
					long prod=1;int j;
					for(j=0;j<4;j++)
					{
						if(prod==0)
							break;
						prod*=arr[k+j][i];
					}
					if(prod>prod_col&&j==4)
						prod_col=prod;
				}
			}
		}
		System.out.println(prod_row);
	}
}