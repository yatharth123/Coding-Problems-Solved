import java.util.*;
import java.io.*;
import javafx.util.*;

public class PAs
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        long s = Long.parseLong(st.nextToken());
        ArrayList<Pair<Long,Long>> arl = new ArrayList<Pair<Long,Long>>();
        for(int i=0;i<n;i++)
        {
            st = new StringTokenizer(br.readLine());
            arl.add(new Pair(Long.parseLong(st.nextToken()),Long.parseLong(st.nextToken())));
            Collections.sort(arl,new SortByCondition());
        }
        long sum=0,count=s;
        for(Pair<Long,Long> x: arl)
        {
            // System.out.println(x.getKey()+" "+x.getValue());
            sum =sum+ count + x.getKey()-x.getValue();
            count+=x.getKey();
        }
        System.out.println(sum);
    }
}
class SortByCondition implements Comparator<Pair<Long,Long>>
{
    public int compare(Pair<Long,Long> a, Pair<Long,Long> b)
    {
        if(a.getKey()<b.getKey()||(a.getKey()==b.getKey()&&a.getValue()<b.getValue())) return -1;
            return 1;
    }
}