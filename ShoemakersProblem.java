import java.io.*;
import java.util.*;

public class ShoemakersProblem
{
	static int count = 0;
		static void mergeSort(TimeandFine A[], int p, int r)
		{
			if(p<r)
			{
				int q = (p+r)/2;
				mergeSort(A,p,q);
				mergeSort(A,q+1,r);
				merge(A,p,q,r);
			}
		}
		static void merge(TimeandFine A[], int p, int q, int r)
		{
			TimeandFine left[] = new TimeandFine[q-p+1];
			TimeandFine right[] = new TimeandFine[r-q];
			int i=0,j=0,k=p;
			for(;i<left.length;i++)
			{
				left[i] = A[p+i];
			}
			for(;j<right.length;j++)
			{
				right[j] = A[q+j+1];
			}
			i = 0;
			j = 0;
			while(k<A.length)
			{//System.out.println(j);
				if(i<left.length&&j<right.length)
				{	
					if((left[i].fine * right[j].time)>=(left[i].time * right[j].fine))
					{
						//System.out.println("value of index at i (in if) = "+i);
						A[k] = left[i];
						i+=1;
					}	
					else
					{ //System.out.println(" value of index at j (in else) = "+j);
						A[k] = right[j];
						j=j+1;
					}
				}
				else if(i==left.length&&j<right.length)
				{	//System.out.println(" value of index at j (in else if) = "+j);
					A[k] = right[j];
					j=j+1;
				}
				else if(j==right.length&&i<left.length)
				{
					//System.out.println(" value of index at i (in else if) = "+i);
					A[k] = left[i];
					i+=1;
				}	
				/*count++;
				System.out.println("Value = "+A[k].index+" Counter = "+count);
*/
				k+=1;
			}	
		}
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			int test,t,f,i,n;
			//test = sc.nextInt();
			n = sc.nextInt();
			TimeandFine taf[] = new TimeandFine[n];
				for(i=0;i<n;i++)
				{
					t= sc.nextInt();
					f= sc.nextInt();
					taf[i] = new TimeandFine();
					taf[i].time = t;
					taf[i].fine = f;
					taf[i].index = (i+1);
				}
				mergeSort(taf,0,(n-1));
				for(i=0;i<n;i++)
				{
					//System.out.println("Index of 0th element"+taf[0].index);
					System.out.println(taf[i].index);
				}
				
				//System.out.println(sc.next());
				
				
		}	
}
class TimeandFine
{
	int time;
	int fine;
	int index;
}