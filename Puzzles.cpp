#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int m,n;
	cin>>n>>m;
	int inp[m],arr[m-n+1];
	for(int i=0;i<m;i++)
	{
		cin>>inp[i];
	}
	sort(inp,inp+m);
	for(int i=0;i<=m-n;i++)
	{
		arr[i] = inp[i+n-1]-inp[i];
	}
	int min=0;
	for(int i=1;i<=m-n;i++)
	{
		if(arr[i]<arr[min])
		{
			min=i;
		}
	}
	cout<<arr[min];
	return 0;
}