#include<iostream>
using namespace std;
int search(int*,int,int);
void insert(int*,int, int ,int);
void deleteatpos(int *,int,int);
int main()
{
	int t,n,s,ins,posi,del,posdel;
	cout<<"Input the no. of test cases"<<endl;
	cin>>t;
	
	for(int i=0;i<t;i++){
	cout<<"Input the size of the array"<<endl;
		cin>>n;
		int a[n];
		cout<<"Input the elements of the array"<<endl;
		for(int i=0;i<n;i++)
		{
			cin>>a[i];
		}
		cout<<"Input the elements to be searched"<<endl;
		cin>>s;
		int flag=search(a,n,s);
		if(flag==0)
			cout<<"element not present"<<endl;
		cout<<"Input the element to be inserted and its position"<<endl;
		cin>>ins>>posi;
		insert(a,n,ins,posi);
		cout<<"Input the position of element to be deleted"<<endl;
		cin>>posdel;
		deleteatpos(a,n,posdel);		
		
			
	}
}
int search(int *a,int n,int s)
{
	//int n =a.length();
	
	int flag=0;
	for(int j=0;j<n;j++)
	{	
		if(s==a[j]){
			flag=1;
			cout<<"Element at "<<(j+1)<<" position"<<endl;
			break;
		}
	}
	return flag;
}
void insert(int *a,int n,int ins, int pos )
{
	int i,b=a[n-1];
	for( i=(n-1);i>pos-1;i--)
		a[i]=a[i-1];
	a[i]=ins;
	
	for(i=0;i<n-1;i++)
		cout<<a[i]<<endl;
	cout<<b<<endl;
}
void deleteatpos(int *a,int n,int posdel)
{
	int i;
	for(i=posdel;i<n;i++)
	{
		a[i]=a[i+1];
	}
	for(i=0;i<n-1;i++)
	{
		cout<<a[i]<<endl;		
	}	
}
