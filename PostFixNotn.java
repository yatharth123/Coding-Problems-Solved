import java.io.*;
import java.util.*;
public class PostFixNotn
{
	static StringBuilder sb=new StringBuilder();
	public static void push(char ch)
	{
		sb.append(ch);
	}
	public static char pop()
	{
		int last = sb.length()-1;
		char ch=sb.charAt(last);
		sb.setLength(last);
		return ch;
	}
	public static char peek()
	{
		return sb.charAt(sb.length()-1);
	}
	public static int size()
	{
		return sb.length();
	}
	 
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		String s[]=new String[t];
		for(int j=0;j<t;j++)
		{
			
			s[j]=sc.next();
			//System.out.println(s.length);

			for(int i=0;i<s[j].length();i++)
			{
				if(s[j].charAt(i)=='('||s[j].charAt(i)=='^')
				{
				push(s[j].charAt(i));
				}
				else if(s[j].charAt(i)=='*'||s[j].charAt(i)=='/')
				{
					while(peek()=='^'||peek()=='*'||peek()=='/')
					{
						System.out.print(pop());	
					}
					push(s[j].charAt(i));
				}
				else if(s[j].charAt(i)=='+'||s[j].charAt(i)=='-')
				{
					while(peek()=='^'||peek()=='*'||peek()=='/'||peek()=='+'||peek()=='-')
					{
						System.out.print(pop());	
					}	
					push(s[j].charAt(i));
				}
				else if(s[j].charAt(i)==')')
				{
					while(peek()!='(')
					{
						System.out.print(pop());
					}
					pop();
				}
				else
					System.out.print(s[j].charAt(i));
			}				
			System.out.println();
		}	
	}
}