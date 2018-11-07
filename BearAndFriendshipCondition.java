import java.util.*;
public class BearAndFriendshipCondition
{
    static int c_v=0;static long c_e=0;
    static boolean vert[] = new boolean[150123];
    static class Vertex
    {
        List<Integer> adj = new ArrayList<>();
    }
    public static void dfs(Vertex vs[],int a)
    {
        vert[a]=true;
        c_v+=1;
        c_e+=vs[a].adj.size();
        for(int b: vs[a].adj)
        {
            if(!vert[b])
                dfs(vs,b);
            // System.out.println(b+" "+vert[b]);
        }
        // System.out.println(c_v+" "+c_e);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Vertex vs[] = new Vertex[n];
        for(int i=0;i<n;i++)
            vs[i] = new Vertex();

        for(int i=0;i<m;i++)
        {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            vs[a].adj.add(b);
            vs[b].adj.add(a);
        }
        for(int i=0;i<n;i++)
        {
            if(!vert[i])
            {
                c_v=0;
                c_e=0;
                dfs(vs,i);
                // System.out.println(c_v+" "+c_e);
                if(c_e!=((long)c_v*(c_v-1)))
                {    
                    System.out.println("NO");
                    System.exit(0);
                }
            }
        }
        System.out.println("YES");
    }
}