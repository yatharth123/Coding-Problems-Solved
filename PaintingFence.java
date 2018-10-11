import myFastReader.*;
import java.util.StringTokenizer;
public class PaintingFence
{
    public static long getStrikes(long arr[],int L,int R,long val)
    {
        if(L>R)
        {
            return 0;
        }
        int minim=L;
        for(int i=L+1;i<=R;i++)
        {
            if(arr[i]<arr[minim])
                minim=i;
        }
        return Math.min(R-L+1,getStrikes(arr,L,minim-1,arr[minim])+getStrikes(arr,minim+1,R,arr[minim])-val+arr[minim]);
    }
    public static void main(String args[])
    {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextLong();
        long res = getStrikes(arr,0,n-1,0);
        System.out.print(res);
    }
}
