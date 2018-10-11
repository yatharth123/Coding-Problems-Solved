
#include<iostream>
#include<string.h>
using namespace std;
bool isRotation(char* a, char* b)
{
	int n = strlen(a);
	int m = strlen(b);
	if(n!=m)
		return false;
	int lps[n];

	int len = 0;
	int i=1;
	lps[0]=0;
	while(i<n)
	{
		if(a[i]==b[len])
		{
			lps[i] = ++len;
			++i;
		}
		else
		{
			if(len==0){
				lps[i] = 0;
				++i;
			}
			else {
				len = lps[len-1];
			}
		}
	}
	i=0;
	for(int k = lps[n-1];k<m;k++)
	{
		if(b[k]!=a[i++]){
			return false;
		}
		return true;
	}
}
int main()
{
	char* a = "GEEKS";
	char* b = "EKSGE";
	cout<<isRotation(a,b)?"1":"0";
	return 0;
}