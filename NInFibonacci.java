import java.util.*;
public class NInFibonacci
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		long n = sc.nextLong();
		if(Math.ceil(Math.sqrt(5*Math.pow(n,2)+4))==Math.floor(Math.sqrt(5*Math.pow(n,2)+4))||Math.ceil(Math.sqrt(5*Math.pow(n,2)-4))==Math.floor(Math.sqrt(5*Math.pow(n,2)-4)))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
		
	}
}