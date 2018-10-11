#include<iostream>
#include<algorithm>
using namespace std;
typedef long long ll;

int main()
{
	ll n;
	ll* a = new ll[3];
	cin>>n;
	ll* dp = new ll[n+1];
	for(int i=0;i<3;i++)
		cin>>a[i];
	for(int i=0;i<=n;i++)
	{
		dp[i]=-4000;
	} 
	dp[0]=0;
	for(int i=0;i<=n;i++)
	{
	 for(int j=0;j<3;j++)
	 {
	 	int val=i-a[j];
	 	if(val>=0)
	 	{
	 		dp[i] = max(dp[i],dp[i-a[j]]+1);
	 	}
	 }
	}
	cout<<dp[n];
	return 0;
}