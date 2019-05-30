import java.io.*;
public class Meal
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		StringBuffer sb = new StringBuffer("");
		while(t-->0)
		{
			int a[] = new int[32];
			int n = Integer.parseInt(br.readLine());
			for(int i=0;i<n;++i)
			{
				int index =0;
				char c = ' ';
				do{
				    c = (char)br.read();
				    if(c=='a')
				    {
				    	if((index&1)==0)
				    	index += 1;
				    }
				    else if(c=='e')
				    {
				    	if((index&2)==0)
				    	index += 2;
				    }
				    else if(c=='i')
				    {
				    	if((index&4)==0)
				    	index += 4;
				    }
				    else if(c=='o')
				    {
				    	if((index&8)==0)
				    	index += 8;
				    }
				    else if(c=='u')
				    {
					if((index&16)==0)
					index += 16;
                    }
				}while(c!=' '&&c != '\n');
				
                a[index] += 1;
			}
			int cnt =0;
			for(int i=0;i<31;++i)
			{
				for(int j=i+1;j<=31;++j)
				{
				 if((i|j)==31)
				 {
				  cnt += a[i]*a[j];
				 }
				}
			}
			cnt += (a[31]*(a[31]-1))/2;
			sb.append(Integer.toString(cnt)+"\n");
		}
		System.out.println(sb.toString());
	}
}