#include<iostream>
using namespace std;
class Processes{
	public:
		
		int bt;
		int at;
		int wt;
};
int main()
{
	Processes p[4];
	int i=0;
	float wtsum,wtavg;
	for(;i<4;i++)
	{
		cout<<"Enter the burst time"<<endl;
		cin>>p[i].bt;
		if(i==0)
		p[i].at=0;
		else{
			cout<<"Enter the arrival time"<<endl;
			cin>>p[i].at;
		}
		
	}
	wtsum=0;
	cout<<"ArrivalTime\tBurstTime\tWaitingTime"<<endl;
	for(i=0;i<4;i++)
	{
		if(i==0)p[i].wt=0;
		else
		p[i].wt=p[i-1].at+p[i-1].bt+p[i-1].wt-p[i].at;
		wtsum=wtsum+p[i].wt;	
		cout<<p[i].at<<"\t"<<p[i].bt<<"\t"<<p[i].wt<<endl;
	}
	wtavg=wtsum/4;
	cout<<"Average Waiting time="<<wtavg<<endl;
	return 0;
}
