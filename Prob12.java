public class Prob12
{
	public static void main(String args[])
	{
		int a=0;
		int i=1000;
		int numofdiv = 0;
		while(numofdiv<500)
		{
			numofdiv = 0;
			a=i*(i+1)/2;
			int squarert = (int)Math.sqrt(a);
			for(int j=1;j<=squarert;j++)
			{
				if(a%j==0)numofdiv+=2;
			}
			if(squarert*squarert==a)
				numofdiv-=1;
			i++;
		}	
		System.out.println(a+" "+i+" "+numofdiv);
	}
}