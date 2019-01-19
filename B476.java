import java.util.*;
public class B476
{
    static int dp[] = new int[13];
    static double calcProb(int pos1, int cnt)
    {
        int l = (pos1+cnt)/2,u =(cnt-pos1)/2;
        // System.out.println(cnt+" "+pos1);
        if(cnt==0)
            return 1;
        return (dp[cnt]/(dp[l]*dp[u]))/Math.pow(2,cnt);
    }
    
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        char c[] = sc.next().toCharArray();
        int pos1 = 0, cnt=0;
        double prob = 0;
        dp[0] = 1;
        for(int i=1;i<=10;i++)
        {
            dp[i] = i*dp[i-1];
        }
        for(int i=0;i<c.length;i++)
        {
            if(c[i]=='+')pos1++;
            else pos1--;
        }
        c = sc.next().toCharArray();
        for(int i=0;i<c.length;++i)
        {
            if(c[i]=='+') pos1--;
            else if(c[i]=='-') pos1++;
            else cnt++;
        }
        pos1 = (int)Math.abs(pos1);
        if(cnt>=pos1&&cnt%2==pos1%2)
        {
            prob = calcProb(pos1,cnt);
        }
        System.out.println(prob);
    }
}