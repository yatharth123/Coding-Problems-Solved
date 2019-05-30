public class Josephus_RecurrentProblem
{
	private int x;
	private class OpenSolution
	{
		public OpenSolution()
		{
			System.out.println("Best Position for not dying 'josephus problem' (implementing open solution to recurrence problem): "+solve(x));
		}
		private int solve(int n)
		{
			if(n==1)
				return 1;
			else{
				if(n%2==0)
					return (2*solve((n/2))-1);
				else
					return (2*solve(((n-1)/2))+1);
			}
		}
	}
	private class ClosedSolution
	{
		//It was possible to find a closed solution only by identifying a pattern in the solutions corresponding to the value of n
		public ClosedSolution()
		{
			// System.out.println("First using looping");
			System.out.println("Best Position for not dying 'josephus problem' (implementing closed solution to recurrence problem): "+solve_using_loop(x));
			// System.out.println("Second using Bitwise operation");
			System.out.println("Best Position (in binary) for not dying 'josephus problem' (implementing closed solution to recurrence problem): "+solve_using_bit(x));
		}
	
	
		private int solve_using_loop(int n)
		{
			int m = 1;
			while(m<=n)
				m *= 2;
			m /= 2;
			return 2*(n-m)+1;
		}

		private String solve_using_bit(int n)
		{
			String inp = Integer.toBinaryString(n);
			char c = inp.charAt(0);
			return inp.substring(1)+c;
		}
	}

	public Josephus_RecurrentProblem(int x)
	{
		if(x<1)
			throw new IllegalArgumentException("The number needs to be positive!");
		this.x = x;
	}
}