public class BIT
{
	int A[];
	int size;
	public BIT(int size)
	{
		A = new int[size];
		this.size = size;
	}
	void update(int i, int delta)
	{
		while(i<size)
		{
			A[i]+=delta;
			//i&(-i)==lowestOneBit(i)
			i+=Integer.lowestOneBit(i);
		}
	}
	int sum(int i)
	{
		int mysum=0;
		while(i>0)
		{
			mysum+=table[i];
			i-= i&-i;
		}
		return sum;
	}
	int rangeSum(int i, int j)
	{
		return sum(i)-sum(j);
	}
}