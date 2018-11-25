import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import javafx.util.Pair;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
public class MaratonIMEJ
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char c;
        int x;
        List<Pair<Integer,Character>> al = new ArrayList<Pair<Integer,Character>>();
        boolean flag = true;
        
        for(int i=0;i<m;i++)
        {
            st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            c = st.nextToken().charAt(0);
            if(flag)
            {
                // System.out.print(c);
                if(c=='M'||(al.size()>0&&al.get(al.size()-1).getValue()!=c&&Math.abs(x-al.get(al.size()-1).getKey())<4))
                    flag = false;
                else
                {
                    al.add(new Pair<Integer,Character>(x,c));
                }
            }
        }
        System.out.println(((flag)?"Yes":"No"));
    }
}