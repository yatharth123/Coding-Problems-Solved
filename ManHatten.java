import java.util.*;
import java.io.*;
public class ManHatten
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int t = sc.nextInt();
        for(int i=1;i<=t;++i)
        {
            System.out.print("Case #"+i+": ");
            int P = sc.nextInt();
            int Q = sc.nextInt();
            
            int we[] = new int[Q+1];
            int sn[] = new int[Q+1];
            
            // Set<Pair<Integer,Integer>> set = new HashSet<Pair<Integer,Integer>>();
            // int dir[] = new int[Q];
            // List<Character> dir = new ArrayList<Character>();
            // List<Pair<Integer,Integer>> l= new ArrayList<Pair<Integer, Integer>>(); 
            // int grid[][][] = new int[Q][Q][Q];
            for(int j = 0;j<P;j++)
            {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                char c = sc.next().charAt(0);
                if(c=='N')
                {
                    sn[y+1] += 1;
                }
                else if(c=='S')
                {
                    sn[0] +=1;
                    sn[y] -= 1;
                }
                else if(c=='E')
                {    
                    we[x+1] += 1;
                }
                else
                {
                    we[0] += 1;
                    we[x] -= 1;
                } 
                
                // l.add(new Pair(x,y));    
                // dir.add(c);
            }
            int maxX = 0,maxY=0;
            for(int j=0;j<Q;++j)
            {
                we[j+1] += we[j];
                sn[j+1] += sn[j];
                if(we[j+1]>we[maxX])
                    maxX = j+1;
                if(sn[j+1]>sn[maxY])
                    maxY = j+1;
            }
            
            System.out.println(maxX+" "+maxY);
        }
    }
}