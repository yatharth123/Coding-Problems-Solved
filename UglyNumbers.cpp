#include<iostream>
using namespace std;
int isDivisible(int no, int div)
{
	if(no%div==0)
		return no/div;
	return no;
}
int isUgly(int no)
{
	no = isDivisible(no,2);
	no = isDivisible(no,3);
	no = isDivisible(no,5);
	if(no==0)
	{
		return 1;
	}
	return 0;
}
int findUglyNumber(int n)
{
	int count = 1,i=1;
	while(n>count)
	{
		i++;
		if(isUgly(i))
		{
			count++;
		}
	}
	return i;
}
int main()
{
	int n = 7;
	int ugly = findUglyNumber(n);
	cout<<ugly;
	return 0;
}