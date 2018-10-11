#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int n,maxim=0;
	cin>>n;
	int inp[n];
	for(int i=0;i<n;i++)
	{
		cin>>inp[i];
		if(maxim<inp[i])
			maxim = inp[i];
	}
	
	long long int arr[maxim];

	for(int i=0;i<maxim;i++)
		arr[i]=0;

	for(int i=0;i<n;i++)
		arr[inp[i]-1]+=inp[i];
	for(int i=2;i<maxim;i++)
	{
		if(i<3)
		{
			arr[i]+=arr[i-2];
		}
		else
		arr[i]+=max(arr[i-2],arr[i-3]);
	}
	if(maxim>1)
	{
	if(arr[maxim-1]>arr[maxim-2])
		cout<<arr[maxim-1];
	else
		cout<<arr[maxim-2];
	}
	else
	{
		cout<<arr[maxim-1];
	}
	return 0;
}