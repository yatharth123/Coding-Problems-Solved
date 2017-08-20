#include <bits/stdc++.h>
using namespace std;

int n,k,i;
double s,a;

int main()
{
	cin>>n>>k;
	while (cin>>a) s+=a*min({++i,k,n-i+1,n-k+1});
	printf("%.6f",s/(n-k+1));
}
