import java.util.LinkedList;
import java.util.Collections;
public class Kruskal
{
	static class WeightedGraph
	{
		int src;
		int des;
		int weight;
		WeightedGraph(int src,int des,int weight)
		{
			this.src = src;
			this.des = des;
			this.weight = weight;
		}
	}
	static class Graph
	{
		int V;
		LinkedList<WeightedGraph> adjList[];
		Graph(int V)
		{
			this.V = V;
			adjList = new LinkedList[V];
			for(int i=0;i<V;i++)
				adjList[i] = new LinkedList<>();
		}
	
		public void addEdge( int src, int des,int weight)
		{
			WeightedGraph wg = new WeightedGraph(src,des,weight);
			WeightedGraph wg1 = new WeightedGraph(des,src,weight);
			this.adjList[src].addFirst(wg);
			this.adjList[des].addFirst(wg1);
		}
		//problem is occuring in the sortEdges function so it has been commented

		// public void sortEdges()
		// {
		// 	Collections.sort(this.adjList, new SortByWeight());
		// }

		// public void printGraph(){
  //           for (int i = 0; i <V ; i++) {
  //               LinkedList<WeightedGraph> list = adjList[i];
  //               for (int j = 0; j <list.size() ; j++) {
  //                   System.out.println("vertex-" + i + " is connected to " +
  //                           list.get(j).des+" with weight " +  list.get(j).weight);
  //               }
  //           }
  //       }
	
	}

	public static void main(String args[])
	{
		int V = 6;
		Graph graph = new Graph(V);
		graph.addEdge(0,1,4);
		graph.addEdge(0,2,3);
		graph.addEdge(1,3,2);
		graph.addEdge(1,2,5);
		graph.addEdge(2,3,7);
		graph.addEdge(3,4,2);
		graph.addEdge(4,0,4);
		graph.addEdge(4,1,4);
		graph.addEdge(4,5,6);
		// graph.printGraph();
		// graph.sortEdges();

	}
}
class SortByWeight implements Comparator<WeightedGraph>
{
	public int compare(WeightedGraph a,WeightedGraph b)
	{
		return a.weight-b.weight;
	}
}
