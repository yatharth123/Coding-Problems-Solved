#include<iostream>
using namespace std;
int highFreq(string a,int n)
{
	int *b= new int[26]; 
	for(int i=0;i<26;i++)
	{
		b[i]=0;
	}
	for(int i=0;i<n;i++)
	{
		b[tolower(a[i])-'a']++;
	}
	int maximum=0;
	for(int i=1;i<26;i++)
	{
		if(b[i]>b[maximum])
		{
			maximum=i;
		}
	}
	return b[maximum];
}
int main()
{
	string a;
	cin>>a;
	int b= highFreq(a,a.length());
	cout<<b;
	return 0;
}