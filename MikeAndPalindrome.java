import java.io.*;
import java.util.*;
public class MikeAndPalindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s;
		int count=0;
		s= sc.nextLine();		
		for(int i=0;i<s.length()/2;i++)
		{
			//System.out.println("ys");	
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				count++;
				if(count>1)
				{	System.out.println("NO");	
					break;
				}
			}
		}
		if(count==1||s.length()==1||(count==0&&s.length()%2==1))
			System.out.println("YES");
		if(count==0&&s.length()>1&&s.length()%2==0)
			System.out.println("NO");
	}
}