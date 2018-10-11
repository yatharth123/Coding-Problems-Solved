#include<iostream>
#include<algorithm>	
using namespace std;
long int findMax(long int arr[],int first,int last,long int maximum)
{
	if(last<=first)
		return maximum;
	int mid = (last+first)/2;
	if(arr[first]>maximum)
	{
		if(arr[first]>arr[last])
			maximum = arr[first];
		else maximum = arr[last];
	}
	if(arr[mid]>maximum)
		maximum = arr[mid];
	return max(findMax(arr,mid+1,last,maximum),findMax(arr,first,mid-1,maximum));
}
int main()
{
	int n;
	cin>>n;
	long int arr[n];
	for(int i=0;i<n;i++)
		cin>>arr[i];
	int i=0,j=n-1;
	long int max = findMax(arr,i,j,-1);
	cout<<max;
	return 0;
}