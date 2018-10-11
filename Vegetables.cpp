#include<iostream>
#include<algorithm>
#include<math.h>
int main()
{
	int n,m;
	cin>>n;
	int arr[n],money;
	for(int i=0;i<n;i++)
	{
		cin>>arr[i];
	}
	sort(arr,arr+n);
	cin>>m;
	for(int i=0;i<m;i++)
	{
		cin>>money;
		for(int j=0;j<n;j++)
		{
			if((int)floor((float)money/(n-j)>arr[j])
			{
				money-=arr[j];
			}
			else
			{
				if(money>=n)
				{
					cout<<money/(n-j);
				}
				else
					cout<<money/n+1;
				money=0;
				break;
			}
		}
		if(money>0)
			cout<<-1;
	}
	return 0;
}