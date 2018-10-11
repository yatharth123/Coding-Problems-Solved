#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;
typedef long long ll;
ll getMaxWithSumAndDigits(int m,int s,ll d)
{
    if(m==0&&s>0||s==0&&d==0)
     return -1;
    if(s==0)
    {
     return d;
    }
    else if(s>=10)
    {
        return getMaxWithSumAndDigits(m-1,s-9,d+9*(pow(10,m-1)));
    }
    else
    {
        return getMaxWithSumAndDigits(m-1,0,d+s*pow(10,m-1));
    }
}
int main()
{
	int m,s;
	cin>>m>>s;
	ll great = getMaxWithSumAndDigits(m,s,0);
	cout<<great;

	return 0;
}