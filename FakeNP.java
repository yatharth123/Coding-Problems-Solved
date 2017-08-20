import java.io.*;
import java.util.*;

public class FakeNP
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		if(l!=r)
			System.out.println(2);
		else
			System.out.println(l);	
	}
}