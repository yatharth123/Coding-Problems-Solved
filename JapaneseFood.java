import java.util.*;
import java.io.*;
import javafx.util.*;

public class JapaneseFood
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        int t = Integer.parseInt(br.readLine()),x,y,r;
        char c;
        Map<Pair,Integer> map = new HashMap<Pair,Integer>();
        StringTokenizer st;
        while(t-->0)
        {
            st = new StringTokenizer(br.readLine());
            c = st.nextToken().charAt(0);
            flag = true;
            x = Integer.parseInt(st.nextToken());y = Integer.parseInt(st.nextToken()); r = Integer.parseInt(st.nextToken());
            Pair<Integer,Integer> p = new Pair<Integer, Integer>(x,y);
            if(c=='A')
            {
                if(map.containsKey(p))
                {
                    System.out.println("No");
                }
                else
                {
                    for(Pair <Integer,Integer>pair: map.keySet())
                    {
                        int tx = pair.getKey(), ty = pair.getValue();
                        if(Math.sqrt(Math.pow(tx-x,2)+Math.pow(ty-y,2))<(double)map.get(pair)+(double)r)
                        {
                            System.out.println("No");
                            flag = false;
                            break;
                        }
                        // System.out.println(Math.sqrt(Math.pow(tx-x,2)+Math.pow(ty-y,2))+" "+(map.get(pair)+r));
                    }
                    if(flag)
                    {
                        System.out.println("Ok");
                        map.put(p,r);
                    }
                }
            }
            else
            {
                if(map.containsKey(p)&&map.get(p)==r)
                {
                    System.out.println("Ok");
                    map.remove(p);
                }
                else
                    System.out.println("No");
            }
        }
    }
}