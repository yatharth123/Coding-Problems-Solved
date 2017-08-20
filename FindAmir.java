//abbaabbaabba
import java.io.*;
import java.util.*;

public class FindAmir
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.println(n/2-1);
		else if(n>1)
			System.out.println(n/2);		
		else
			System.out.println(0);
	}
}