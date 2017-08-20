#include<iostream>
#include<cmath>
#define ll long long
using namespace std;
int main()
	{
		ll n;
		cin>>n;
		ll temp=n;
		int count=0;
		while(temp!=0){
			temp=temp/10;
			count++;
		}
		count--;
		
		int nn=n/pow(10,count)+1;
		ll newn=nn*pow(10,count);
		if(n!=0)
		cout<<(newn-n);
		else cout<<1;
		return 0;
	}
