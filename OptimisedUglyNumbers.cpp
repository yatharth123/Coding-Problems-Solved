#include<iostream>
using namespace std;
int findUglyNumber(int n)
{
	int i_2=0,i_3=0,i_5=0;
	int arr[n];
	int min_value;
	arr[0] = 1;
	next_mul_2 = 2*(arr[i_2]);
	next_mul_3 = 3*(arr[i_3]);
	next_mul_5 = 5*(arr[i_5]);
	for(int i=1;i<n;i++)
	{
		min_value = min(next_mul_5,next_mul_3,next_mul_2);
		arr[i] = min_value;
		if(min_value==next_mul_2)
		{
			i_2+=1;
			next_mul_2 = arr[i_2]*2;
		}
		else if(min_value==next_mul_3)
		{
			i_3+=1;
			next_mul_3 = arr[i_3]*3;
		}
		else if(min_value==next_mul_5)
		{
			i_5+=1;
			next_mul_5 = arr[i_5]*5;
		}
	}
	return arr[n-1];
}
int main()
{
	int n;
	cin>>n;
	int ugly = findUglyNumber(n);
	cout<<ugly;
	return 0;
}