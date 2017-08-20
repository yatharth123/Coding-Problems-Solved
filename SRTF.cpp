#include<iostream>
using namespace std;
class Process{
	public:
		int at;
		int bt;
		int rt;
};
int main()
{
	int n,i,j,time;
	float wt_sum,ta_sum;
	cout<<"Enter the no. of processes"<<endl;
	cin>>n;
	Process p[n],keyP;
	for(i=0;i<n;i++)
	{
		if(i==0)
		{
				p[i].at=0;
				cout<<"Arrival time of the first process(P1) is considered zero"<<endl;
		}
		else
		{
			cout<<"Enter the arrival time of the process P"<<(i+1)<<endl;
			cin>>p[i].at;	
		}
		cout<<"Enter the burst time of the process P"<<(i+1)<<endl;
		cin>>p[i].bt;
		p[i].rt=p[i].bt;
	}
	time=p[0].bt;
	for(i=0;i<n-1;i++)
	{
		j=i+1;
		
		while(p[j].at<time)
		{
			if(p[j].bt<(p[j-1].rt-p[j].at))
			{
				keyP=p[j-1];
				p[j-1]=p[j];
				p[j]=keyP;
			}
			else
				p[j-1].rt=p[j-1].rt-p[j].at;
			j++;
		}
		time+=p[i].bt;
	}
	time=0;
	wt_sum=0;
	ta_sum=0;
	cout<<"ArrivalTime  BurstTime WaitingTime TurnAroundTime"<<endl;
	for(i=0;i<n;i++)
	{
		//p[i].wt=time-p[i].at;
		wt_sum=wt_sum+time-p[i].at;
		ta_sum=ta_sum+time-p[i].at+p[i].bt;	
		cout<<" "<<p[i].at<<"\t\t"<<p[i].bt<<"\t"<<time-p[i].at<<"\t\t"<<time-p[i].at+p[i].bt<<endl;
		time=time+p[i].bt;
	}
	cout<<"Average Waiting time="<<wt_sum/n<<endl;
	cout<<"Average Turn Around time= "<<ta_sum/n<<endl;
	return 0;
}
