import java.util.*;
// The Tower of Hanoi Problem with three towers and 'n' discs A proper example for Recurrence problem
public class TOH
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		move(n,'A','C','B');
	}

	//operation of moving n discs from 'from' tower to 'to' tower using the 'aux' tower
	public static void move(int n, char from, char to, char aux)
	{
		//check if there are no more discs left to move
		if(n>0)
		{
			//first we need to move 'n-1' discs to 'aux' tower, as larger discs cannot be kept over smaller discs
			move(n-1,from,aux,to);

			//move nth disc from 'from' to 'to' tower
			if(n==1)
				System.out.println("Move "+n+"st disc from "+from+" to "+to);
			else if(n==2)
				System.out.println("Move "+n+"nd disc from "+from+" to "+to);
			else if(n==3)
				System.out.println("Move "+n+"rd disc from "+from+" to "+to);
			else
				System.out.println("Move "+n+"th disc from "+from+" to "+to);
			//move the rest 'n-1' discs to 'to' tower from the 'aux' tower
			move(n-1,aux,to,from);
		}
	}
}