import java.io.*;
import java.util.*;

public class TheUselessToy
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int start = (int)(sc.next().charAt(0));
		int end = (int)(sc.next().charAt(0));
		long n = sc.nextLong();
		//System.out.println(start+" "+end);
		
//v (ASCII code 118, lowercase v), < (ASCII code 60), ^ (ASCII code 94) or > (ASCII code 62)		
		if(n%2==0)
		{
			System.out.println("undefined");
		}
		else
		{
			if(((((start==118)&&(end==62))||((start==62)&&(end==94))||((start==94)&&(end==60))||((start==60)&&(end==118)))&&(n%4==1))||((((start==118)&&(end==60))||((start==60)&&(end==94))||((start==94)&&(end==62))||((start==62)&&(end==118)))&&(n%4==3)))
				System.out.println("ccw");
			else
				System.out.println("cw");
		}
		
	}
}