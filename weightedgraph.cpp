#include<bits/stdc++.h>
using namespace std;

void addEdge(vector <pair<int, int> > adj[], int u, 
                                     int v, int wt) 
{ 
    adj[u].push_back(make_pair(v, wt)); 
    adj[v].push_back(make_pair(u, wt)); 
}
int main()
{
	int T;
	cin>>T;
	for(int i=0;i<T;i++)
	{
		int V,E,v,e,c;
		cin>>V>>E;
		vector<pair<int, int>> adj[V];
		for(int j=0;j<E;j++)
		{
			cin>>v>>e>>c;
			addEdge(adj,v,e,c);
		}
	}
}