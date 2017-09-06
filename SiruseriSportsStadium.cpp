#include<iostream>
#include<algorithm>
using namespace std;
struct Event{
	int start;
	int duration;
	int end;
};
bool compareEvent(Event lhs, Event rhs){ 
if(lhs.end==rhs.end)
	return (lhs.start<rhs.start);
	return (lhs.end < rhs.end);
}
int Greed(Event* e,int n)
{
	int count=1;
	Event ptr =e[0];	
	for(int i= 1;i<n;i++)
	{
		if(ptr.end>e[i].start)
		{
			continue;
		}
		count++;
		ptr = e[i];
		//cout<<"start= "<<ptr.start<<" dur= "<<ptr.duration<<" end= "<<ptr.end;
	}
	return count;
}
int main()
{
	int n,i,count;
	cin>>n;
	Event e[n];
	for(i=0;i<n;i++)
	{
		cin>>e[i].start>>e[i].duration;
		e[i].end = e[i].start + e[i].duration;
	}
	
	std::sort(e ,(e+n), compareEvent);
	/*for(i=0;i<n;i++)
	{
		cout<<"start = "<<e[i].start<<" dur= "<<e[i].duration<<" end= "<<e[i].end<<endl;
	}*/
	count = Greed(e,n);
	cout<<count<<endl;
	return 0;
}
